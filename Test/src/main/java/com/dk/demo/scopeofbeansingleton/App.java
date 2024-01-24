package com.dk.demo.scopeofbeansingleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/dk/demo/scopeofbeansingleton/NewFile.xml");
		Vehicle v1 = context.getBean("vehicleBean", Vehicle.class);
		System.out.println(v1);
		System.out.println(v1.hashCode());
		System.out.println("============");
		Vehicle v2 = context.getBean("vehicleBean", Vehicle.class);
		System.out.println(v2);
		System.out.println(v2.hashCode());
	}

}

//output
//singleton
//Vehicle [VehicleName=null, VehicleNo=null]
//1786294176
//============
//Vehicle [VehicleName=null, VehicleNo=null]
//1786294176

//propotype
//Vehicle [VehicleName=null, VehicleNo=null]
//1430439149
//============
//Vehicle [VehicleName=null, VehicleNo=null]
//359922172

