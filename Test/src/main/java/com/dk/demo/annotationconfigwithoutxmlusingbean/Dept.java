package com.dk.demo.annotationconfigwithoutxmlusingbean;

import org.springframework.beans.factory.annotation.Value;

public class Dept {
	@Value("ISE")
	private String DeptName;
	
	public void getDeptName() {
		System.out.println(this.DeptName);
	}

}
