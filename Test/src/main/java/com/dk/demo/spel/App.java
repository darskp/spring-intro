package com.dk.demo.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/dk/demo/spel/NewFile.xml");
		SpelExp spelExp=context.getBean("spelExp",SpelExp.class);
		System.out.println(spelExp);
	}
}

//output
//SpelExp [x=11, y=20.0, m=5.0, i=true, power=5.0, staticVariable=3, stringObjectvalue=Darshan, stringListType=[true]]