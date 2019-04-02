package com.reviewall;

import java.util.Scanner;

public class Reverse2toCharArray {

	public static void main(String[] args) {
		Scanner input;
		String reverse;
		String reverse1="";
		input=new Scanner(System.in);
		System.out.println("Enter your phrase");
		reverse=input.nextLine();
		char[] array=reverse.toCharArray();
		for(int i=array.length-1; i>=0; i--) {
			reverse1=reverse1+array[i];
			
		}System.out.println(reverse1);
		
		String[] a=reverse1.split(" ");
for(int y=a.length-1; y>=0; y--) {
	System.out.print(a[y]+" ");
}
	}

}
