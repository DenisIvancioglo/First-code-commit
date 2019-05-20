package com.class35;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Beginning of the code");

try {
	
	Thread.sleep(2000);//object of an exception might be thrown(new InterruptedException )
}catch(InterruptedException e){
	System.out.println("I am a catch block of code");
	e.getMessage();
}
System.out.println("The end of the program");
	}

}
