package com.dk.demo.scopeofbeansingleton;

public class Vehicle {
 private String VehicleName;
 private String VehicleNo;
 
@Override
public String toString() {
	return "Vehicle [VehicleName=" + VehicleName + ", VehicleNo=" + VehicleNo + "]";
}
public String getVehicleName() {
	return VehicleName;
}
public void setVehicleName(String vehicleName) {
	VehicleName = vehicleName;
}
public String getVehicleNo() {
	return VehicleNo;
}
public void setVehicleNo(String vehicleNo) {
	VehicleNo = vehicleNo;
}
public Vehicle(String vehicleName, String vehicleNo) {
	super();
	VehicleName = vehicleName;
	VehicleNo = vehicleNo;
}
public Vehicle() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
