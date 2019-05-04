package com.class24;

public class MethodOverload {
	static void m() {
		System.out.println("Privet");
		
	}
	static void m(int n) {
		System.out.println("Privet"+n);
		
	}
	static void m(String s, int i) {
		System.out.println("Privet"+s+" "+i);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 MethodOverload.m();
		 MethodOverload.m(1);
		 MethodOverload.m("Denis",5);
	}

}
