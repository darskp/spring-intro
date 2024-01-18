package com.dk.demo.model1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "START" );
        ApplicationContext context= new ClassPathXmlApplicationContext("com/dk/demo/model1/config1.xml");
        Student a=(Student) context.getBean("student1");
        System.out.println(a);
        
        System.out.println(context.getBean("student1"));
        
       Student b=(Student) context.getBean("student2");
       System.out.println(b);
       
       Student c=(Student) context.getBean("student3");
       System.out.println(c);
       System.out.println(context.getBean("student3"));
        System.out.println( "END" );
    }
}
