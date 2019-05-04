package com.class28;

public interface Bank {
	static String name="Bank";// by default all variables inside the interface are static, public and final
void hasChecking();
void hasSavings();
void hasCreditCard();
}
class BOA implements Bank{

	@Override
	public void hasChecking() {
		// TODO Auto-generated method stub
		System.out.println("BOA has 2 checking accounts");
	}

	@Override
	public void hasSavings() {
		System.out.println("BOa has 2 savings accounts ");
	}

	@Override
	public void hasCreditCard() {
		System.out.println("BOa has 10 different cc");
		
	}
	
}
class PNC implements Bank{

	@Override
	public void hasChecking() {
		System.out.println("PNC has 3 checking accounts");
		
	}

	@Override
	public void hasSavings() {
		System.out.println("PNC has 3 savings accounts ");
	}

	@Override
	public void hasCreditCard() {
		System.out.println("PNC has 7 different cc");
		
	}
	
}