package com.dk.demo.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	public Dept dept;
	
	@Qualifier("dept1")
	@Autowired
	public void setDept(Dept dept) {
		this.dept = dept;
		System.out.println("Injecting the property using getter/setter");
	}

	public Dept getDept() {
		return this.dept;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Dept dept) {
		this.dept = dept;
		System.out.println("Injecting the property using constructor");
	}

	@Override
	public String toString() {
		return "Emp [dept=" + dept + "]";
	}

}
