package com.reviewall;

public class ForLoopHappyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 19;
        String b = String.valueOf(a);
        char[] c = b.toCharArray();
        int sq = 0;
        
        for(int i = 0; i < a; i++) {
            
            for(int j = 0; j < 2; j++) {
                sq = sq + Character.getNumericValue(c[j]) * Character.getNumericValue(c[j]);
            }
            
            
            System.out.println(sq);
	}

}}
