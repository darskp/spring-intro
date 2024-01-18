package com.dk.demo.constructorDI;

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
        ApplicationContext context= new ClassPathXmlApplicationContext("com/dk/demo/constructorDI/config1.xml");
       Emp e1=context.getBean("emp1",Emp.class);
       System.out.println(e1);
       Emp e2=context.getBean("emp2",Emp.class);
       System.out.println(e2);
        System.out.println( "END" );
    }
}
