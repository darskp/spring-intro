package com.dk.demo.constructorDI;

public class Emp {
private String eName;
private int eId;
private double eSal;

public Emp(String eName, int eId, double eSal) {
	super();
	this.eName = eName;
	this.eId = eId;
	this.eSal = eSal;
}

@Override
public String toString() {
	return "Emp [eName=" + eName + ", eId=" + eId + ", eSal=" + eSal + "]";
}


}
