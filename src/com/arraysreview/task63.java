package com.arraysreview;

public class task63 {
	public static void main(String[] args)
	{
		int[][] a = {
			{1,1,1},
			{1,1,1},
			{1,1,1}
		};
		
for(int i=0; i<a.length; i++) {
	for(int y=0; y<a[i].length; y++) {
		if(!((a.length)==(a[i].length))) {
			System.out.println("True");	
			
		}else {
			System.out.println("False");
		}
	}
}


	

	}
}
