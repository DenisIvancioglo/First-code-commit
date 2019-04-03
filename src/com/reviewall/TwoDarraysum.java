package com.reviewall;

public class TwoDarraysum {
public static void main(String[] args) {
	int[][] array= {
			
			{10,2,4,5,8},
			{5,6,7,8,9},
			{7,5,3,4,9}
	};
	
int sum=0;
int sum1=0;
int sum2=0;
	for(int y=0; y<array.length; y++) {
		for(int i=0; i<array[y].length; i++) {
		
		sum+=array[0][i];
		sum1+=array[1][i];
		sum2+=array[2][i];
	
		
		}
		System.out.println();

		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);
		break;
		
	}
	
		
	
	
	
	
	


}
}
