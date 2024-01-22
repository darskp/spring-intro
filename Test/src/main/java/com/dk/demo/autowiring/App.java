package com.dk.demo.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/dk/demo/autowiring/config1.xml");
		Emp e1=context.getBean("emp1",Emp.class);
		System.out.println(e1);
		Dept d1=context.getBean("dept1",Dept.class);
		System.out.println(d1);
		Dept d2=context.getBean("dept2",Dept.class);
		System.out.println(d2);
		System.out.println("END");
	}
}
