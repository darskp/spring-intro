package com.dk.demo.lifecycleinterfacev5;

import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Exam implements InitializingBean, DisposableBean{
	private String examName;
	private double examDuration;
	
	@Override
	public String toString() {
		return "Exam [examName=" + examName + ", examDuration=" + examDuration + "]";
	}
	
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		System.out.println("---Property Assigned---");
		this.examName = examName;
	}
	public double getExamDuration() {
		return examDuration;
	}
	public void setExamDuration(double examDuration) {
		this.examDuration = examDuration;
	}
	@Override
	public void afterPropertiesSet() throws Exception{
		System.out.println("---Property has been Initialized by calling init()---");
	}
	@Override
	public void destroy() throws Exception{
		System.out.println("---Property has been Destroyed by calling destroy()---");
	}
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

}
