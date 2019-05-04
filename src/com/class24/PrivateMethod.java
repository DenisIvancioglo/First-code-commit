package com.class24;

public class PrivateMethod {
	private  void m() {
		System.out.println("Privet");
		
	}
	private  void m(int n) {
		System.out.println("Privet"+n);
		
	}
	private  void m(String s, int i) {
		System.out.println("Privet"+s+" "+i);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PrivateMethod obj=new  PrivateMethod();
		obj.m();
		obj.m(1);
		obj.m("Denis",5);
	}

}
