package com.example.demo;

import com.example.demo.service.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
    // Tạo mã khoá mật khẩu
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Cung cấp nguồn dữ liệu đăng nhập
    @Bean
    public UserDetailsService userDetailsService() {
        return new UserDetailsServiceImpl();

    }

    // Phân quyền sử dụng
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable);


        http.authorizeHttpRequests(auth -> auth
                .requestMatchers("/order/**").authenticated()
                .requestMatchers("/admin/**").hasAnyRole("NhanVien", "QuanLy")
                .requestMatchers("/rest/authorities").hasRole("QuanLy")
                .anyRequest().permitAll());

        http.formLogin(fomLogin -> fomLogin
                .loginPage("/security/login/form")
                .loginProcessingUrl("/security/login")
                .defaultSuccessUrl("/security/login/success", false)
                .failureUrl("/security/login/error"));


        http.rememberMe(rme -> rme   // ghi nhớ đăng nhập
                .tokenValiditySeconds(86400));

        http.exceptionHandling(ex -> ex  // try xuất một số địa chỉ chưa được cấp quyền
                .accessDeniedPage("/security/unauthoried"));

        http.logout(lgOut -> lgOut
                .logoutUrl("/security/logoff")
                .logoutSuccessUrl("/security/logoff/success"));

        return http.build();
    }

    // Cho phép truy xuất REST API từ bên ngoài (domain khác)
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().requestMatchers(HttpMethod.OPTIONS, "/**");
    }
}
