package com.class25;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Payment parent=new Payment();
parent.makePayment();

MasterCard mc=new MasterCard();
mc.makePayment();

Visa visa=new Visa();



//achieving runtime polymorphism
// pay-reference variable, Payment -type
//new MasterCard();-creating an Object
Payment pay=new MasterCard();
pay.closePayment();
pay.makePayment();


	}

}
