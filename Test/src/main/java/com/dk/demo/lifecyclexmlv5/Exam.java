package com.dk.demo.lifecyclexmlv5;

public class Exam {
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
	
	public void init() {
		System.out.println("---Property has been Initialized by calling init()---");
	}
	
	public void destroy() {
		System.out.println("---Property has been Destroyed by calling destroy()---");
	}
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
