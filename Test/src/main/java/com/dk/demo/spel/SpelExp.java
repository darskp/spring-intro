package com.dk.demo.spel;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelExp {
	@Value("#{5+6}")
	private int x;
	
	@Value("#{20>5?20:5}")
	private double y;
	
	@Value("#{'20h'>'5h'?20:5}")
	private double m;
	
	@Value("#{5>3}")
	private boolean i;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double power;
	
	@Value("#{T(java.lang.Math).PI}")
	private int staticVariable;
	
	@Value("#{new java.lang.String('Darshan')}")
	private String stringObjectvalue;
	
	@Value("#{new java.util.ArrayList().add('java')}")
	private List<String> stringListType;

	@Override
	public String toString() {
		return "SpelExp [x=" + x + ", y=" + y + ", m=" + m + ", i=" + i + ", power=" + power + ", staticVariable="
				+ staticVariable + ", stringObjectvalue=" + stringObjectvalue + ", stringListType=" + stringListType
				+ "]";
	} 
	

	
}
