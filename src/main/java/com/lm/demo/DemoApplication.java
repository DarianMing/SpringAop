package com.lm.demo;

import com.lm.demo.controller.UserController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        SpringApplication application = new SpringApplication(DemoApplication.class);
//        application.run(args);
//        AnnotationConfigServletWebServerApplicationContext
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//        UserController bean = context.getBeanFactory().getBean(UserController.class);
//        System.out.println(bean.toString());


    }

}
