package com.class5;

public class logicalOperatorsAnd {
	public static void main(String[] args) {
		  /*if number is between 1-10 -->is small
		   * if number is between 11-100 -->is medium
		   * if number is between 101-1000-->is large
		   */
		int num=15;
		if (num>=1 && num<=10) {
			System.out.println("number is small");
		}else if(num>=11 && num<=100) {
			System.out.println("number is medium");
		}else if(num>=101 && num<=100) {
			System.out.println("number is large");
		}
	}

}
