package com.class26;

public class Bank {
	public void getBalance() {
		System.out.println(0);
	}
	
}

class A extends Bank{
	public void getBalance() {
		System.out.println("Bank A $" + 1000);
	}
	final void Balance() {
		System.out.println(1);
	}
	final void Balance(int a) {
		System.out.println(a+" overload");
	}

}
class B extends Bank{
	public void getBalance() {
		System.out.println("Bank B $" + 1500);
	}
	final void Balance() {
		System.out.println("Privet");
	}

}
class C extends Bank{
	public void getBalance() {
		System.out.println("Bank C $" + 2000);
	}

}
