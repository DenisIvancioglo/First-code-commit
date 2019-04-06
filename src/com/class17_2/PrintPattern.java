package com.class17_2;

public class PrintPattern {
	public static void main(String[] args) {
		PrintPattern obj=new PrintPattern();
		obj.print();
	}
	void print() {
		for(int i=7; i>=1; i--) {
			for(int a=7; a>=8-i; a--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
