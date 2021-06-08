package com.dawes.seguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.dawes.serviciosImpl.ServicioUsuarioImpl;

@Configuration
@EnableWebSecurity
public class MiSeguridad extends WebSecurityConfigurerAdapter {
	
	@Autowired
	ServicioUsuarioImpl sui;

	@Bean 
	public BCryptPasswordEncoder encripta() { 
	    return new BCryptPasswordEncoder(); 
	}
	
//	Autenticacion
	
// configuramos la autorizacion
	
	// configuramos la autorizacion
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			
			 http
		      .csrf().disable()
		      .authorizeRequests()
		      .antMatchers("/admin/**").permitAll()
		      .antMatchers("/static*").permitAll()
		      .antMatchers("/login*").anonymous()
		      .and()
		      .formLogin()
		      .loginPage("/login")
		      .loginProcessingUrl("/login")
		      .defaultSuccessUrl("/index", true)		      
		      .and()
		      .logout()
		      .logoutUrl("/logout")
		      .deleteCookies("JSESSIONID");
		      
		}
		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			
			auth.userDetailsService(sui);
		}
}

