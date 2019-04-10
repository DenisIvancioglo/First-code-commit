package com.class19;

public class replnNoneSix {

	
		
		
			String mixString(String s1, String s2) {
			
			  String s="";
			
			String[] array=s1.split("");
			
			String[] array1=s2.split("");
			  
			  for(int i=0; i<array.length; i++) {
				 
					 s=s+array[i]+array1[i];
				 
				 
			  }
			  
			  
			
			  return s;
				
			}
			
			//
			public static void main(String[] args){
				replnNoneSix obj=new replnNoneSix();
				System.out.println(obj.mixString("12345","abcde")); //should be 1a2b3c4d5e
				System.out.println(obj.mixString("howdy","hello")); //should be hhoewldlyo
			}
		
	

}
