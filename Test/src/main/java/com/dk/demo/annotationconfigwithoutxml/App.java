package com.dk.demo.annotationconfigwithoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		Demo d1 = context.getBean("demo", Demo.class);
		System.out.println(d1);
		System.out.println(d1.demoMethod());
	}

}
