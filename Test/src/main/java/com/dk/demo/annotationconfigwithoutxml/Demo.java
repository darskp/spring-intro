package com.dk.demo.annotationconfigwithoutxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("10")
	private int x;
	
	@Value("Darshan")
	private String str;
	
	@Value("10.7")
	private Double k;
	
	public String demoMethod() {
		return "K value is "+this.k;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", str=" + str + ", k=" + k + "]";
	}

	public Demo(int x, String str, Double k) {
		super();
		this.x = x;
		this.str = str;
		this.k = k;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Double getK() {
		return k;
	}

	public void setK(Double k) {
		this.k = k;
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
