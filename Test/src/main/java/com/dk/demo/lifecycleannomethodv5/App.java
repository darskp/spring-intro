package com.dk.demo.lifecycleannomethodv5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/dk/demo/lifecycleannomethodv5/config.xml");
		Exam e1=context.getBean("exam1",Exam.class);
		context.registerShutdownHook();
		System.out.println(e1);
	}

}
