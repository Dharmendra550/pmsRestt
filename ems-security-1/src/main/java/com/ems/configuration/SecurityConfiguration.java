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
		//IN MEMORY AUTHENTICATION//(1)BASIC LOGIN MODEL//
		
		/*http.authorizeRequests().antMatchers("/delete**").hasAnyRole("ADMIN").anyRequest().permitAll()
		.and().httpBasic().and().exceptionHandling()
		.accessDeniedPage("/WEB-INF/views/accessDenied.jsp").and()
		.csrf().disable();*/
		
		//IN MEMORY AUTHENTICATION//(2)FORM LOGIN MODEL//
		http.authorizeRequests().antMatchers("/delete**").hasAnyRole("ADMIN").anyRequest().permitAll()
		.and().formLogin().and().exceptionHandling()
		.accessDeniedPage("/WEB-INF/views/accessDenied.jsp").and()
		.csrf().disable();
		
		//HOW TO CUSTOMIZED LOGIN PAGE//(3)OUR OWN LOGIN PAGE//
		
		/*http.authorizeRequests().antMatchers("/delete**")
		.hasAnyRole("ADMIN").anyRequest().permitAll()
		.and().formLogin().loginPage("/login").loginProcessingUrl("/doLogin")
		.failureUrl("/login?error=Badcredentials")
		.and().exceptionHandling()
		.accessDeniedPage("/WEB-INF/views/accessDenied.jsp").and()
		.csrf().disable();*/
		
		//Session Management//
		/*http.sessionManagement().maximumSessions(1);*/
		
		//Logout Session//
		http.logout().logoutUrl("/logoutMe").logoutSuccessUrl("/loggedOut").permitAll();
		
		http.requiresChannel().anyRequest().requiresSecure();
	}
	
	@Autowired
	public void ConfigureGlobal(AuthenticationManagerBuilder builder)throws Exception
	{
		/*builder.inMemoryAuthentication().withUser("situ").password(encoder.encode("123456")).roles("ADMIN")
		.and().withUser("allen").password(encoder.encode("allen123")).roles("ACCOUNTANT");*/
		
		//DATABASE AUTHENTICATION WITH DEFAULT LOGIN PAGE//
		builder.jdbcAuthentication().dataSource(dataSource())
		.usersByUsernameQuery("select username,password,enabled from users where username=?")
		.authoritiesByUsernameQuery("select username,authority from authorities where username=?")
		.passwordEncoder(encoder);
	}

	
		public DataSource dataSource()
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

