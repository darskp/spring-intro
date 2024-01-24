package com.dk.demo.annotationconfigwithoutxmlusingbean;

import org.springframework.beans.factory.annotation.Value;

public class Emp {
	private String EmpName;
	private Dept Dept;
	
	public void getEmpData() {
		Dept.getDeptName();
		System.out.println(this.EmpName);
	}

	@Override
	public String toString() {
		return "Emp [EmpName=" + EmpName + ", Dept=" + Dept + "]";
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public Dept getDept() {
		return Dept;
	}

	public void setDept(Dept dept) {
		Dept = dept;
	}

	public Emp(String empName, com.dk.demo.annotationconfigwithoutxmlusingbean.Dept dept) {
		super();
		EmpName = empName;
		Dept = dept;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
