package com.class35;

public class ChildToParentException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array= {17,99,8};

try {
	System.out.println(array[2]);
}catch(Exception e) {
	e.getMessage();
}

System.out.println("Code after an exception");

	}

}
