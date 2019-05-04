package com.reviewclass30;

public abstract  class Staff {
String name;
String address;
long telNum;
String vehicleType;
double stipend;

abstract void getVehicleType(String vehicleType);
abstract void getName(String name);
abstract void getAddress(String address);
abstract void getTelNum(long telNum);
abstract void computeStipend(double stipend);

}
class Professors1 extends Staff{

	@Override
	void getVehicleType(String vehicleType) {
	this.vehicleType=vehicleType;
	System.out.println(vehicleType);
		
	}

	@Override
	void getName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
		System.out.println(name);
	}

	@Override
	void getAddress(String address) {
		// TODO Auto-generated method stub
		this.address=address;
		System.out.println(address);
	}

	@Override
	void getTelNum(long telNum) {
		// TODO Auto-generated method stub
		this.telNum=telNum;
		System.out.println(telNum);
	}

	@Override
	void computeStipend(double stipend) {
		// TODO Auto-generated method stub
		this.stipend=stipend;
		System.out.println(stipend);
	}
	
}