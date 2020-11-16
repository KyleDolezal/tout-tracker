package io.github.kyledolezal.touttracker.security

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
class SecurityConfig : WebSecurityConfigurerAdapter() {
    override fun configure(web: WebSecurity): Unit {
        web
            .ignoring()
            .antMatchers("/")
            .antMatchers("/authenticate")
            .antMatchers("/static/**")
            .antMatchers("/index.html")
    }

    @Autowired
    fun configureGlobal(auth: AuthenticationManagerBuilder): Unit {
        auth
            .inMemoryAuthentication()
            .withUser("user").password("user").roles("USER")
            .and()
            .withUser("admin").password("admin").roles("ADMIN")
    }
}