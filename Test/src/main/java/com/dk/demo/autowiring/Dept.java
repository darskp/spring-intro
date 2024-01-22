package com.dk.demo.autowiring;

public class Dept {
private String deptName;
private int deptNo;

public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public int getDeptNo() {
	return deptNo;
}
public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}
@Override
public String toString() {
	return "Dept [deptName=" + deptName + ", deptNo=" + deptNo + "]";
}
public Dept() {
	super();
	// TODO Auto-generated constructor stub
}

}
