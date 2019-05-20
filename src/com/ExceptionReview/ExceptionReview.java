package com.ExceptionReview;

public class ExceptionReview  {
void arithmetic(int a,int b)throws ArithmeticException {
//	System.out.println(a/b);
	int result=a/b;
	if(b>0) {
		System.out.println(result+ "my result");
	}else {
		throw new ArithmeticException("You cant do it");
	}
}
void nullPointer(String s) {
	System.out.println(s.toLowerCase());
}
int[] arr= {1,2,3,4,5};
void arrayIndex() {
	System.out.println(arr[6]);
}
void stringIndexOutOfBounds(String a) {
	System.out.println(a.charAt(7));
}

void negativeArraySizeException() {
	int size=-2;
	 int[] array=new int[size];
	System.out.println(array.length);
}
}
