package com.reviewall;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={40000, 42000, 341 ,600, 505, 10000, 7};
		int max1 = arr[0];
	    int max2 = 0;
	    int min = arr[0];
	    for (int i = 1; i < arr.length; i++){

	    	if(arr[i] < max1 && arr[i] > max2)
	    		max2 = arr[i];
	        if(arr[i] > max1) {
	        	max2 = max1;
	        	max1 = arr[i];
	        }
	        if(arr[i] < min) {
	        	min = arr[i];
	        }
	    }
	    
	    
	    System.out.println(max1);
	    System.out.println(min);
		System.out.println(max2);
	}

}
