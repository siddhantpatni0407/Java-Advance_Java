package com.sid.employeemanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Siddhant
 *
 *         May 19, 2021
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.sid.employeemanager.controller")).build().apiInfo(apiDetails());
	}
	
	private ApiInfo apiDetails() {
		return new ApiInfoBuilder().title("Employee Management API")
				.description("This API can be used to get profile level actions and information for an employee")
				.version("V1.0").build();
	}

}
