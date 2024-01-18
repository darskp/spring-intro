package com.dk.demo.collectionTypeDI;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class emp {
	private List<String> vehicle;
	private Set<String> email;
	private Map<String, String> name;
	
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "emp [vehicle=" + vehicle + ", email=" + email + ", name=" + name + "]";
	}
	
	public List<String> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<String> vehicle) {
		this.vehicle = vehicle;
	}

	public Set<String> getEmail() {
		return email;
	}

	public void setEmail(Set<String> email) {
		this.email = email;
	}

	public Map<String, String> getName() {
		return name;
	}

	public void setName(Map<String, String> name) {
		this.name = name;
	}

}
