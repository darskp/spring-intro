package com.dk.demo.referenceTypeDI;

public class A {
private int x;
private B b;
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
@Override
public String toString() {
	return "A [x=" + x + ", b=" + b + "]";
}
public B getB() {
	return b;
}
public void setB(B b) {
	this.b = b;
}
public A() {
	super();
	// TODO Auto-generated constructor stub
}
}
