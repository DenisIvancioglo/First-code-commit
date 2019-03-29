package com.TwoDarraysreview;

public class Task4 {

	public static void main(String[] args) {
		int[][] r = { { 2, 6, 9, 3, 7 }, 
				           { 1, 7, 9, 4, 8 }, 
			               { 0, 4, 6, 2, 5 }, 
				           { 0, 1, 2, 3 } };
	double sum=0;
		for(int i=0; i<r.length; i++) {
			
				sum+=r[i][2];
			
		}
System.out.println(sum/r.length);
sum=0;
for (int[] t:r) {
	sum+=t[2];
}
System.out.println(sum/r.length);
	}

}
