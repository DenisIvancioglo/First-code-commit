package com.class29;

public abstract class Marks {
 abstract void getPercentage();
 int average;
}
class A extends Marks{
	
A(int a,int b, int c){
	average=(a+b+c)/3;
}
	@Override
	void getPercentage() {
		// TODO Auto-generated method stub
		System.out.println(average);
	}
	
}
class B extends Marks{


	B(int a,int b, int c, int d){
		average=(a+b+c)/3;
	}
		@Override
		void getPercentage() {
			// TODO Auto-generated method stub
			System.out.println(average);
		}
		
	}
