package git.io.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity.http

@Configuration
@EnableWebSecurity
class SecurityConfig {
    @Bean
    fun configure(http: HttpSecurity) {

        http
            .csrf()
            .disable()
        http
            .headers()
            .frameOptions()
            .disable()

        http
            .authorizeRequests()
            .antMatchers("/users/**")
            .permitAll()
    }
}