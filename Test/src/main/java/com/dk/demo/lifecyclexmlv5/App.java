package com.dk.demo.lifecyclexmlv5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("---Main START---");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/dk/demo/lifecyclexmlv5/config.xml");
		Exam e1 = context.getBean("exam1", Exam.class);
		context.registerShutdownHook();
		System.out.println(e1);
		System.out.println("---Main END---");
	}
}


// output

//---Main START---
//---Property Assigned---
//---Property has been Initialized by calling init()---
//Exam [examName=Mathematics, examDuration=1.5]
//---Main END---
//---Property has been Destroyed by calling destroy()---