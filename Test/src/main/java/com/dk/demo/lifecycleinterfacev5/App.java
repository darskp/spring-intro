package com.dk.demo.lifecycleinterfacev5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("---Main START---");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/dk/demo/lifecycleinterfacev5/config.xml");
		Exam e1 = context.getBean("exam1", Exam.class);
		context.registerShutdownHook();
		System.out.println(e1);
		System.out.println("---Main END---");
	}
}