package com.demo.SpringBootMVCCRUDProduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootMvccrudProductApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootMvccrudProductApplication.class, args);
		/*for(String name:ctx.getBeanDefinitionNames()) {
			System.out.println(name);
		}*/
	}

}
