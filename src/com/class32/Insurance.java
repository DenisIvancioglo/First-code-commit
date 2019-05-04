package com.class32;

public abstract class Insurance {
	String insuranceName;
	Insurance(String insuranceName){
		this.insuranceName=insuranceName;
	}
	
	abstract void getQuote();
	abstract void cancelInsurance();

}
class Pet extends Insurance{
	Pet(String insuranceName) {
		super(insuranceName);
		// TODO Auto-generated constructor stub
	}

	String petType="Labrador";
	@Override
	void getQuote() {
		// TODO Auto-generated method stub
		System.out.println("GetQouote"+petType);
	}

	@Override
	void cancelInsurance() {
		// TODO Auto-generated method stub
		System.out.println("Pet Cancel insurance"+petType);
	}
	
}
class Health extends Insurance{

	Health(String insuranceName) {
		super(insuranceName);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getQuote() {
		// TODO Auto-generated method stub
		System.out.println("GetQouote Health");
	}

	@Override
	void cancelInsurance() {
		// TODO Auto-generated method stub
		System.out.println("Cancel insurance Health");
	}
	
}
class Car extends Insurance{
Car(String insuranceName) {
		super(insuranceName);
		// TODO Auto-generated constructor stub
	}

String carModel="Honda Civic";
	@Override
	void getQuote() {
		// TODO Auto-generated method stub
		System.out.println("GetQuote Insurance"+carModel);
	}

	@Override
	void cancelInsurance() {
		// TODO Auto-generated method stub
		System.out.println("Cancel Insurance---- Insurance"+carModel);
	}
}
