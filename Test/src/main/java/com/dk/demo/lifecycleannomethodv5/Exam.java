package com.dk.demo.lifecycleannomethodv5;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Exam {

	private String examName;
	private double examDuration;

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public double getExamDuration() {
		return examDuration;
	}

	public void setExamDuration(double examDuration) {
		this.examDuration = examDuration;
	}

	@Override
	public String toString() {
		return "Exam [examName=" + examName + ", examDuration=" + examDuration + "]";
	}

	@PostConstruct
    public void start() {
        System.out.println("-----INIT()----");
    }

    @PreDestroy
    public void stop() {
        System.out.println("-----destroy()----");
    }

}
