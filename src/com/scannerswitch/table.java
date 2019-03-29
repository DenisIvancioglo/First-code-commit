package com.scannerswitch;
import java.util.Scanner;


public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		  System.out.println("Input the Number: ");
		  int n = in .nextInt();
		  for (int a = 1; a <= 12; a++) {
		   System.out.println(n + "*" + a + " = " + (n * a));
		  }
	}

}
