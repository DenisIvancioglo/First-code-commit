package com.TwoDarraysreview;

public class Task1 {

	public static void main(String[] args) {
		int[][] ar= {{1,2,3},{4,5,6,9},{7,8}};
		for(int i=0; i<ar.length; i++) {
			for(int y=0; y<ar[i].length;y++) {
				
			}
			System.out.println(ar[i].length);
		}
		for(int[] inner:ar) {
			System.out.println(inner.length);
		}
			
		
		for(int i=0; i<ar.length; i++) {
			for(int y=0; y<ar[i].length;y++) {
			System.out.print(ar[i][y]+" ");	
			}
			
		}
		System.out.println();
		for(int[] inner:ar) {
			for(int el:inner) {
			System.out.print(el+" ");
		}
		}
	}

}
