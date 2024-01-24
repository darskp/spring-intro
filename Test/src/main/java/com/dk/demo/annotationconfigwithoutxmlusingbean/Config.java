package com.dk.demo.annotationconfigwithoutxmlusingbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Dept getDept() {
		Dept de=new Dept();
		return de;
	}
	
	@Bean
	public Emp getEmp() {
		Emp emp=new Emp("Hi",getDept());
		return emp;
	}
	
}
