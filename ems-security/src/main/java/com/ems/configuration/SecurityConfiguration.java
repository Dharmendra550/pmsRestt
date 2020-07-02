package com.ems.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{
@Autowired
BCryptPasswordEncoder encoder;

protected void configure(HttpSecurity http)throws Exception
{
/*http.authorizeRequests()
.antMatchers("/delete**")
.hasAnyRole("ADMIN")
.anyRequest()
.permitAll()
.and()                                                            (///Building AuthenticationManager with in memory authentication)
//.httpBasic()---->configures HTTP Basic Authentication
//.formLogin()----->configures HTTP Form Authentication
 .formLogin()
 .loginPage("/login").loginProcessingUrl("/doLogin").failureUrl("/login?error=Bad Credentials")
.and()
.exceptionHandling()
.accessDeniedPage("/WEB-INF/views/accessDenied.jsp")
.and()
.csrf()
.disable();*/
///*********************************************************************************************////
	///Building AuthenticationManager with Database authentication////
	
	http.authorizeRequests()
	.antMatchers("/delete**")
    .hasAnyRole("ADMIN")
    .anyRequest().authenticated().and()
    .formLogin()
    .and()
    .exceptionHandling()
    .accessDeniedPage("/WEB-INF/views/accessDenied.jsp")
    .and()
    .csrf()
    .disable();
	//Session Management or login in only one browser//
	http.sessionManagement().maximumSessions(1);
	
	
	http.logout().logoutUrl("/logoutMe").logoutSuccessUrl("/loggedOut").permitAll();
	
	//enable https channel//
	http.requiresChannel().anyRequest().requiresSecure();
	
}
@Autowired
public void ConfigureGlobal(AuthenticationManagerBuilder builder)throws Exception
{
	///Building AuthenticationManager with in memory authentication)
	
	/*builder.inMemoryAuthentication().withUser("situ").password(encoder.encode("12345")).roles("ADMIN"))
	.and().withUser("allen").password(encoder.encode("allen123")).roles("ACCOUTANT");*/
	
	///Building AuthenticationManager with Database authentication////
	/*builder.jdbcAuthentication()
	.dataSource(ds())
	.usersByUsernameQuery("select username,password,enabled from users where username=?")
	.authoritiesByUsernameQuery("select username,authority from authorities where username=?")
	.passwordEncoder(encoder);*/
}
	
	public DataSource ds()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/sys");
		ds.setUsername("Mycode");
	    ds.setPassword("mycode@123");
	    return ds;
	}


@Bean
public BCryptPasswordEncoder encoder()
{
	return new BCryptPasswordEncoder();
}
}

