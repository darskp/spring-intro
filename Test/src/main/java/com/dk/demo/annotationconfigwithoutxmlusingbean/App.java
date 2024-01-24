package com.dk.demo.annotationconfigwithoutxmlusingbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Emp d1 = context.getBean("getEmp", Emp.class);
		System.out.println(d1);
		d1.getEmpData();
	}
	
}

//output
//Emp [EmpName=Hi, Dept=com.dk.demo.annotationconfigwithoutxmlusingbean.Dept@27462a88]
//ISE
//Hi