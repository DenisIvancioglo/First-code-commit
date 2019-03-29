package com.class10;

public class Task1 {

	public static void main(String[] args) {
	char[] grades= {'A', 'B', 'C', 'D','E', 'F'};
	System.out.println(grades[1]);
	
	char [] grades1=new char[6];
    grades1 [0]='A';
    grades1 [1]='B';
    grades1 [2]='C';
    grades1 [3]='D';
    grades1 [4]='E';
    grades1 [5]='F';
    System.out.println(grades1[1]);
	
	String[] names={"Anar", "Bilal", "Alishka","Denis", "Deer"};
	System.out.println(names[3]);
	
	String [] names1=new String[4];
    names1[0]="John";
    names1[1]="Mike";
    names1[2]="Sean";
    names1[3]="Denis";
    
   
    System.out.println(names1[3]);
    
	String[] words= {"Java", "Saturday","day", "Coding"};
	System.out.println(words[1]+" is "+words[0]+" "+words[3]+" "+words[2]);
	}

}
