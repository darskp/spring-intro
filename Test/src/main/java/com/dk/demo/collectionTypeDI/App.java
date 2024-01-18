package com.dk.demo.collectionTypeDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/dk/demo/collectionTypeDI/config1.xml");
		emp e1 = (emp) context.getBean("emp1",emp.class);
		System.out.println(e1);

		System.out.println("END");
	}
}
