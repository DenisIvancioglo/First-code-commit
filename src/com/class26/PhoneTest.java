package com.class26;

public class PhoneTest {

	public static void main(String[] args) {
		System.out.println("Object of Parent class");
		Phone phone=new Phone();
		phone.hasCamera();
		phone.makeCall();
		
		
		
		System.out.println("Object of iphone class");
		iPhone iphone= new iPhone();
		iphone.hasCamera();
		iphone.makeCall();
		
		
		
		System.out.println("Object of Samsung class");
		Samsung samsung=new Samsung();
 samsung.makeCall();
 samsung.hasCamera();
 
 
 
 System.out.println("Object of Nokia class");
 Nokia nokia=new Nokia();
 nokia.makeCall();
 nokia.hasCamera();
 
 System.out.println("Object of iphone class referring to the Parent");
 Phone p=new iPhone();
 p.makeCall();
 p.hasCamera();
 
 
 Phone p1=new Nokia();
 p1.makeCall();
 p1.hasCamera();
// p1.cannotBreak(); method is undefined7
 
 Phone parentPhone;
 parentPhone= new iPhone();
 parentPhone.makeCall();
 parentPhone.hasCamera();
 
	}

}
