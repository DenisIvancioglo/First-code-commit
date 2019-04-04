package com.class16;

public class ReverseString {
//* Create a String method called ReverseString
  //  *  method return the string you hard coded
    //* in reverse order(This is the static way)
    //* have the string you will create will say
    //* "seigolonhceT xatnyS"
	
	public static void main(String[] args) {
		ReverseString reverse=new ReverseString();
		reverse.stringReverse();
	}
	void stringReverse() {
		String name="Syntax Technologies";
		char[] array=name.toCharArray();
		for(int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]);
		}
	}
}
