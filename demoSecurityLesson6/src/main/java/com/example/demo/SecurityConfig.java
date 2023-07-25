package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public BCryptPasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("minhbdph24887").password(getPasswordEncoder().encode("09032003")).roles("ADMIN", "USER", "GUEST").build());
        manager.createUser(User.withUsername("hiennttph25063").password(getPasswordEncoder().encode("123456")).roles("USER", "GUEST").build());
        manager.createUser(User.withUsername("User01").password(getPasswordEncoder().encode("123456")).roles("USER").build());
        return manager;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable);
        http.cors(AbstractHttpConfigurer::disable);

        http.authorizeHttpRequests(auth -> auth
                .requestMatchers("/home/admin").hasRole("ADMIN")
                .requestMatchers("/home/user").hasAnyRole("ADMIN", "USER")
                .requestMatchers("/home/authentication").authenticated()
                .anyRequest().permitAll());

        http.exceptionHandling(error -> error
                .accessDeniedPage("/auth/access/denied"));

        http.formLogin(login -> login
                .loginPage("/auth/login/form")
                .loginProcessingUrl("/auth/login")
                .defaultSuccessUrl("/auth/login/success", false)
                .failureUrl("/auth/login/error")
                .usernameParameter("username")
                .passwordParameter("password"));

        http.rememberMe(rem -> rem
                .rememberMeParameter("remember"));

        http.logout(logout -> logout
                .logoutUrl("/auth/logout")
                .logoutSuccessUrl("/auth/logout/success"));

        return http.build();
    }
}
