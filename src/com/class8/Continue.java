package com.class8;

public class Continue {
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			if(i==2 || i==3) {
				continue;
			}
			System.out.println(i);
		}
		for(int a=1; a<=20; a++) {
			if(a%3==0) {
				continue;
			}
			System.out.println(a);
		}
	}

}
