package com.cc.chay.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 *
 * @Author: cc
 * @since: 2020/5/8 0008
 */
@EnableSwagger2
@SpringBootApplication(scanBasePackages = ("com.cc.chay.service"))


public class StartUpApplication {
    public static void main( String[] args ){
    	
    	SpringApplication.run(StartUpApplication.class, args);
		
    }
//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                //标题
//                .title("cc")
//                //简介
//                .description("cc")
//                //服务条款
//                .termsOfServiceUrl("cc")
//                //作者个人信息
//                .contact(new Contact("cc","","chay15@126.com"))
//                //版本
//                .version("1.0")
//                .build();
//    }


}
