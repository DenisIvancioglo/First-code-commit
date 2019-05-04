package com.class32;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] intArray= {10,21,34};
String[] stringArray= {"Hello","Bye"};
//Can we place Object into Array?

Visa visa1=new Visa("Visa Platinum");
Visa visa2=new Visa("Visa Platinum");
Visa visa3=new Visa("Visa Platinum");


AX AX1=new AX("AX Platinum");
AX AX2=new AX("AX Platinum");
AX AX3=new AX("AX Platinum");


CreditCard[] visaArray= {visa1, visa2, visa3,AX1,AX1,AX1};
//array of Objects
Object[] objectArray= {visa1,"John"};
	}

}
