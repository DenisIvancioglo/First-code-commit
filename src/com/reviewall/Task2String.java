package com.reviewall;

public class Task2String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String rev="Sunday";
for(int i=rev.length()-1; i>=0; i--) {
	System.out.print(rev.charAt(i));
}
System.out.println();
String str="Privetik";
if(!(str.isEmpty()) && str.length()%2 !=0 && str.length()>=3){
	System.out.println(str.charAt(str.length()/2));
}
	}

}
