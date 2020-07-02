package com.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableSwagger2
public class PmsRestwebApplication<Docket> implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(PmsRestwebApplication.class, args);
	}
@Override
public void addCorsMappings(CorsRegistry registry)
{
	registry.addMapping("/**").allowedOrigins("*").allowedMethods("*");
}


@Bean
public Docket docket()
{
	return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.pms.controller")).paths(PathSelectors.any()).build();
}
}
