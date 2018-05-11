package com.friend.projectmanagement.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author gxy
 * @description 用于使用Swagger自动創建文档
 * @create 2018-04-27 09:59
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket createDoc() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.friend.projectmanagement"))
				.paths(PathSelectors.any())
				.build().useDefaultResponseMessages(false);
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				// 文档标题
				.title("project_management API")
				// 文档描述
				.description("项目管理系统接口文档")
				.termsOfServiceUrl("https://github.com/optimistic9527/project-management")
				.version("1.0")
				.build();
	}
}
