package com.class11;

public class twoDarrays {

	public static void main(String[] args) {
		//creating 2D array;
		int[][] d=new int[4][4];
		//row1
		d[0][0]=12;
		d[0][1]=13;
		d[0][2]=14;
		d[0][3]=15;
		//row2
		d[1][0]=1;
		d[1][1]=2;
		d[1][2]=3;
		d[1][3]=4;
		//row3
		d[2][0]=5;
		d[2][1]=10;
		d[2][2]=15;
		d[2][3]=20;
		System.out.println(d[1][2]);
		int[][] c= {
				{12,13,14,15},
				{23, 35,26 ,24},
				{45,2342,234,432},
				
				
				
		};
		
		System.out.println(c[1][3]);
		String[][] groups= {
                {"Andrei","Artem","Julia","Zoya"},
                {"Bilal","Shaban","Asmit","Sasha","Olga","Moe"},
                };
        
        System.out.println(groups[0][1]);
        
        System.out.println(groups[0][1]+" "+groups[1][2]);

	}

}
