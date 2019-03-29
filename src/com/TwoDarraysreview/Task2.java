package com.TwoDarraysreview;

public class Task2 {

	public static void main(String[] args) {
		 int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };
		 double sum=0;
		 double average;
		 
			 for(int y=0; y<rating[1].length; y++) {
				 sum+=rating[1][y];
				 
			 }
			 System.out.println(sum);
		 
		 average=sum/5;
		 System.out.println(average);
int num=0;
		 for(int y=0; y<rating.length; y++) {
			 
			 for(int i=0; i<rating[y].length; i++) {
				 if(rating[y][i]>7) {
					 System.out.print(rating[y][i]+", ");
					 num++;
					
				 }
			 }
			 
			
		 }
		System.out.println();
		 System.out.println("The number of all elements above 7 is "+num);
	}
	

}
