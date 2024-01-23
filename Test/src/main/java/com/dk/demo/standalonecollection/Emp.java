package com.dk.demo.standalonecollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private List<String> vehicle;
	private Set<String> email;
	private Map<String, String> name;
	private Properties dbProp;
	
	
	@Override
	public String toString() {
		return "Emp [vehicle=" + vehicle + ", email=" + email + ", name=" + name + ", dbMap=" + dbProp + "]";
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


	public Properties getDbMap() {
		return dbProp;
	}


	public void setDbMap(Properties dbMap) {
		this.dbProp = dbMap;
	}


	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Emp(List<String> vehicle, Set<String> email, Map<String, String> name, Properties dbMap) {
		this.vehicle = vehicle;
		this.email = email;
		this.name = name;
		this.dbProp = dbMap;
	}
	
	
	
}
