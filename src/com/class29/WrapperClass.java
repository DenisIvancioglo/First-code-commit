package com.class29;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer integer1=new Integer(10);//Boxing
System.out.println(integer1);
Integer integer2=10;//AutoBoxing

int num=integer1.intValue();//Unboxing
System.out.println(num);

int num2=integer2;//AutoUnboxing
	}

}