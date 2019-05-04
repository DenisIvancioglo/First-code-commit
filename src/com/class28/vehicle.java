package com.class28;

public abstract class vehicle {
	static int vehicleCoount;
	
	vehicle(){
		vehicleCoount++;
	}
	
	public abstract void start();
	public abstract void drive();
	public void stop() {
		System.out.println("Stop vehicle by pressing break");
	}
	public static void displayTotalVehicles() {
		System.out.println("Total vehicles we vuild= "+vehicleCoount);
	}

}
abstract class Car extends vehicle{
	
}
class BMW extends Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW car starts remote");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("BMW car drives fast");
	}
	
}
class Toyota extends Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Toyota car starts with push button");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Toyota car drives safe");
	}
	
}
