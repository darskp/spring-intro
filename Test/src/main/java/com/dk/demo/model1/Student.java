package com.dk.demo.model1;

public class Student {
private int usn;
private String name;
private double marks;


public Student() {
	super();
}
public int getUsn() {
	return usn;
}
public void setUsn(int usn) {
	System.out.println("setter injection usn");
	this.usn = usn;
}
public String getName() {
	return name;
}
public void setName(String name) {
	System.out.println("setter injection name");
	this.name = name;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	System.out.println("setter injection marks");
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [usn=" + usn + ", name=" + name + ", marks=" + marks + "]";
}


}
