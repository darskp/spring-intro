package com.dk.demo.referenceTypeDI;

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
        ApplicationContext context= new ClassPathXmlApplicationContext("com/dk/demo/referenceTypeDI/config1.xml");
       B b= (B)context.getBean("refB",B.class);
       System.out.println(b);
       A a= (A)context.getBean("refA",A.class);
       System.out.println(a);
        System.out.println( "END" );
    }
}
