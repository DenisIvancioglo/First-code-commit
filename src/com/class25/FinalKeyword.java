package com.class25;

public class FinalKeyword {
	public static final String name="Syntax";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /*Final keyword can be used in 3 places/ways
    * 1.final variables - we CANNOt change their value -->CONSTANT
    * 2. FINAL methods- cannot override final methods--> prevent overrriding
    * 3. final classes - we cannot create a child of a final class -->Prevent inheritance
    * 
    * 
    * 
    */
		
		final String str="Hello";
		
	}
	public final void hello() {
		System.out.println("Hello from Parent class");
	}

}
class ChildOfFinal extends FinalKeyword{
	//CANNOT OVERRIDE FINAL METHOD
	// PUBLIC VOID HELLO(){
	//
}
