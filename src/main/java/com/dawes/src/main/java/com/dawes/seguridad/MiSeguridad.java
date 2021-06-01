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
/*	
	@Bean
	public BCryptPasswordEncoder encripta() {
	    return new BCryptPasswordEncoder();
	}
	*/
//	Autenticacion
	/*
	 configuramos la autorizacion
	 @Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		 http.authorizeRequests().antMatchers("/admin").hasRole ("ADMIN").and().formLogin().loginPage("/login");
		 http.authorizeRequests().antMatchers("/registrado").hasRole ("REGISTRADO").and().formLogin ().loginPage("/login");
		 http.exceptionHandling().accessDeniedPage("/error403");
		 // al salir del logout que pase el control a la vista index
	     http.logout().logoutSuccessUrl("/index");
		 http.csrf().disable();
	}
	// configuramos la autenticacion
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password (passwordEncoder().encode("temporal")).roles("ADMIN");
		auth.inMemoryAuthentication().withUser("user").password (passwordEncoder().encode("temporal")).roles("REGISTRADO");

		auth.userDetailsService(sui).passwordEncoder(encripta());
	}
	*/
	@Override
	protected void configure(final HttpSecurity http) throws Exception {
	    http
	    .csrf().disable()
	      .authorizeRequests()
	      .antMatchers("/adminn/**").hasRole("ADMIN")
	      .antMatchers("/anonymous*").anonymous()
	      .antMatchers("/login*").permitAll()
	      .anyRequest().authenticated()
	      .and()
	      .formLogin()
	      .loginPage("/login.html")
	      .loginProcessingUrl("/perform_login")
	      .defaultSuccessUrl("/", true)
	      .failureUrl("/login.html?error=true")
	      .and()
	      .logout()
	      .logoutUrl("/perform_logout")
	      .deleteCookies("JSESSIONID");
	     
	}
	
}

