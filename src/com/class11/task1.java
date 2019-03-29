package com.class11;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] cars= {
		
			{"Ford", "Chevy","Lincoln", "Buick"},
			{"BMW","Audi","Porche","Volkswagen"},
			{"Hyundai","Kia sorento","Kia sportage","Daewo"},
			{"Ferrari", "Fiat", "Bugatti","Seat"},
		
		
};
for(int row=0; row<cars.length; row++) {
	for(int col=0; col<cars[row].length; col++) {
		System.out.print(cars[row][col]+" ");
		
	}System.out.println();
}
	}

}
