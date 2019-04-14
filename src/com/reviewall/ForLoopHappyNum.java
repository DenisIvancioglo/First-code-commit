package com.reviewall;

public class ForLoopHappyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 19;
        String b = String.valueOf(a);
        char[] c = b.toCharArray();
        int sq = 0;
        
        for(int i = 0; i < c.length; i++) {
        
            
           
                sq = sq + Character.getNumericValue(c[i]) * Character.getNumericValue(c[i]);
                
            
            
                System.out.println(sq);
        	}  
        		
        	
	
        System.out.println(sq);
}}
