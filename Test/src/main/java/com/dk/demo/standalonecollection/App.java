package com.dk.demo.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dk.demo.autowiring.Emp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "START" );
        ApplicationContext context= new ClassPathXmlApplicationContext("com/dk/demo/standalonecollection/config1.xml");
       Emp a=context.getBean("emp1",Emp.class);
       System.out.println(a.getVehicle().getClass().getName());
        System.out.println( "END" );
    }
}
