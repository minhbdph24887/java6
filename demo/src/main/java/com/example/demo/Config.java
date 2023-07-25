package com.example.demo;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import java.util.Locale;

@Configuration
public class Config implements WebMvcConfigurer {
    @Bean("messageSource")
    public MessageSource getMessageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setDefaultEncoding("utf-8");
        messageSource.setBasenames("classpath:menu", "classpath:language/message_en", "classpath:language/message_vi", "classpath:language/global_en", "classpath:language/global_vi");
        return messageSource;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
        interceptor.setParamName("lang"); // hệ thống thay đổi ngôn ngữ
        registry.addInterceptor(interceptor)
                .addPathPatterns("/**") // chắn tất cả
                .excludePathPatterns("/image/**"); // loại thư mục
    }

    @Bean("localeResolver")
    public LocaleResolver getLocaleResolver() {
        CookieLocaleResolver localeResolver = new CookieLocaleResolver();
        localeResolver.setDefaultLocale(new Locale("vi")); // cài ngôn ngữ mặc định
        localeResolver.setCookiePath("/"); // tất cả các đường dẫn
        localeResolver.setCookieMaxAge(10 * 24 * 60 * 60); // lưu trong bao lâu ?
        return localeResolver;
    }
}
