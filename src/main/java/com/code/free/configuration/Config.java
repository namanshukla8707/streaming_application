package com.code.free.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Config {

    // @Bean
    // public ModelMapper modelMapper() {
    // return new ModelMapper();
    // }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }

    // @Bean
    // public UserDetailsService userDetailsService() {
    // UserDetails user_1 =
    // User.withUsername("admin").password(passwordEncoder().encode("root"))
    // .roles(ADMIN.name())
    // .build();

    // UserDetails user_2 =
    // User.withUsername("user").password(passwordEncoder().encode("root"))
    // .roles(USER.name())
    // .build();

    // return new InMemoryUserDetailsManager(user_1, user_2);
    // }
}
