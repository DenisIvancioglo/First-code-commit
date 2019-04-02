package com.class13;

public class StringManipulations1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//toCharArray
		String str="saturday";
		char[] array=str.toCharArray();
		for(char i:array) {
			System.out.print(i);	
		}
		System.out.println();
for(int i=array.length-1; i>=0; i--) {
	System.out.print(array[i]);
}
	}

}
