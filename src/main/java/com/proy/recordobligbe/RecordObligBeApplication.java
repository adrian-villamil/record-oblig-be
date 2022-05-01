package com.proy.recordobligbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@ComponentScan(basePackages = "com.proy")
@EnableJpaRepositories(basePackages = "com.proy")
@EntityScan("com.proy")
public class RecordObligBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecordObligBeApplication.class, args);
    }
    
    @EnableWebSecurity
    @Configuration
    class WebSecurityConfig extends WebSecurityConfigurerAdapter {
        
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.csrf().disable().authorizeRequests()
                    .antMatchers(HttpMethod.GET, "/empresas").permitAll()
                    .antMatchers(HttpMethod.GET, "/empresas/{id}").permitAll()
                    .antMatchers(HttpMethod.POST, "/empresas").permitAll()
                    .antMatchers(HttpMethod.PUT, "/empresas").permitAll()
                    .antMatchers(HttpMethod.DELETE, "/empresas").permitAll()
                    .antMatchers(HttpMethod.GET, "/obligaciones").permitAll()
                    .antMatchers(HttpMethod.GET, "/obligaciones/{id}").permitAll()
                    .antMatchers(HttpMethod.POST, "/obligaciones").permitAll()
                    .antMatchers(HttpMethod.PUT, "/obligaciones").permitAll()
                    .antMatchers(HttpMethod.DELETE, "/obligaciones").permitAll()
                    .antMatchers(HttpMethod.GET, "/pagos").permitAll()
                    .antMatchers(HttpMethod.GET, "/pagos/{id}").permitAll()
                    .antMatchers(HttpMethod.POST, "/pagos").permitAll()
                    .antMatchers(HttpMethod.PUT, "/pagos").permitAll()
                    .antMatchers(HttpMethod.DELETE, "/pagos").permitAll()
                    .anyRequest().authenticated();
        }
    }
}
