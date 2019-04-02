package com.reviewall;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=1;
int b=0;
int c=0;


for(int i=0; i<10; i++) {
	c=a+b;
	a=b;
	b=c;
	System.out.print(a+" ");
}
	}

}
