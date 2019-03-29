package com.class11;

public class ForEachin2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] grocery= {
				{"Banana", "orange", "kiwi"},
				{"Tomato","Cucumber","Celery"},
				{"Cheese","Kefir","Milk"}
				
		};
		for(int i=0; i<grocery.length; i++) {
			for(int j=0; j<grocery[i].length; j++) {
				System.out.print(grocery[i][j]+" ");
				
			}
System.out.println();
		}
		for(String[] veggies:grocery) {
			for(String words:veggies) {
				System.out.print(words+" ");
			}
		System.out.println();
		}
	}

}
