package com.crud.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket postsApi() {

	return new Docket(DocumentationType.SWAGGER_2).groupName("crud").apiInfo(apiInfo()).select()

	.paths(regex("/api.*")).build();

	}



	private ApiInfo apiInfo() {

	return new ApiInfoBuilder().title("RC2 API")

	.description("RC2 Backend  Rest API")

	.termsOfServiceUrl("https://www.youtube.com")

	.license("RC2 API License")

	.licenseUrl("https://www.youtube.com").version("2.0").build();

	}


}