package com.class22;

public class ConstructorTypes {
	 ConstructorTypes(){
		 System.out.println("I am a constructorr with no parameters");
	 }
	 ConstructorTypes(String str){
		 System.out.println("I am a constructor with 1 parameter "+str);
	 }
	 ConstructorTypes(int a, String str){
		 System.out.println("I am a constructor with 2 parameters "+str+" and "+a);
	 }
	 public static void main(String[] args) {
		 ConstructorTypes obj=new  ConstructorTypes(5,"Anar");
	}
	

}
