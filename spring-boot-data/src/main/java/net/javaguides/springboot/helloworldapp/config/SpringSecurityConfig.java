package net.javaguides.springboot.helloworldapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

//@Configuration
//@EnableWebSecurity
public class SpringSecurityConfig  {
//    WebSecurityConfigurerAdapter
//	@Autowired
//	DataSource dataSource;

//	@Autowired
//	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
//		auth.jdbcAuthentication().passwordEncoder(new BCryptPasswordEncoder())
//				.dataSource(dataSource)
//				.usersByUsernameQuery("select username, password from webapp.users where username=?")
//				.authoritiesByUsernameQuery("select username, role from webapp.users where username=?")
//		;
//	}

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable().authorizeRequests()
//				.antMatchers(HttpMethod.OPTIONS, "/**")
//				.permitAll().anyRequest()
//				.authenticated().and()
//				// .formLogin().and()
//				.httpBasic();
//	}
	
}