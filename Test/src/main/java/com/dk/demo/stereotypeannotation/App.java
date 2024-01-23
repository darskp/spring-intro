package com.dk.demo.stereotypeannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args)
	{
        ApplicationContext context= new ClassPathXmlApplicationContext("com/dk/demo/stereotypeannotation/newFile.xml");
        Ipl team1=context.getBean("ipl",Ipl.class);
        System.out.println(team1);
	}

}