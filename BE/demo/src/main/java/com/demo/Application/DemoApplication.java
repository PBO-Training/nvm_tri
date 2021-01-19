package com.demo.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.demo.Application.othergirl.OtherGirl;

@SpringBootApplication
@ComponentScan("com.demo.Application.othergirl")
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("> Trước khi IoC Container được khởi tạo");
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		System.out.println("> Sau khi IoC Container được khởi tạo");
//		Outfit outfit = context.getBean(Outfit.class);
//		System.out.println("Instance: " + outfit);
//		outfit.wear();
//		Outfit outfit2 = context.getBean(Outfit.class);
//		System.out.println("Output Instance: " + outfit2);
//		outfit.wear();
//		Girl girl = context.getBean(Girl.class);
//		System.out.println("Girl Instance: " + girl);
//		System.out.println("Girl Outfit: " + girl.outfit);
//		girl.outfit.wear();
//		System.out.println("> Trước khi IoC Container destroy Girl");
//		((ConfigurableApplicationContext) context).getBeanFactory().destroyBean(girl);
//		System.out.println("> Sau khi IoC Container destroy Girl");
		// ==============End Day18==============

		
		
//		BoyService boyService = context.getBean(BoyService.class);
//		Boy boy = boyService.getNameBoy();
//		System.out.println(boy);
		
		 try {
	            Girl girl = context.getBean(Girl.class);
	            System.out.println("Bean: " + girl.toString());
	        } catch (Exception e) {
	            System.out.println("Bean Girl không tồn tại");
	        }

	        try {
	            OtherGirl otherGirl = context.getBean(OtherGirl.class);
	            if (otherGirl != null) {
	                System.out.println("Bean: " + otherGirl.toString());
	            }
	        } catch (Exception e) {
	            System.out.println("Bean Girl không tồn tại");
	        }
	     // ==============End Day19==============

	}
	

}
