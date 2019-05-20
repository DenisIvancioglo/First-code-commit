package com.ExceptionReview;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExceptionReview obj=new ExceptionReview();
try {
	obj.arithmetic(2, 0);
}catch(Exception e ){
	e.getMessage();
	System.out.println("you cant");
}
obj.arithmetic(2, 2);
try {
obj.nullPointer(null);
}
catch(NullPointerException e) {
	System.out.println(	e.getMessage());
	System.out.println("caught it ");
}
try {
	obj.arrayIndex();
}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(e.getMessage());
	
}
try {
obj.negativeArraySizeException();
}
catch(NegativeArraySizeException e) {
	System.out.println(e.getMessage());
}
finally {
	System.out.println("all exceptions are caught ");
}
}

}
