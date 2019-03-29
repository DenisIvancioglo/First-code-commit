package com.class11;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		
		int[] numbers= {23, 24,25,26};
		int min=numbers[0];
		
for(int i=0; i<numbers.length; i++) {
	if(numbers[i]>max) {
		max=numbers[i];
	}if(numbers[i]<min) {
		min=numbers[i];
	}
}System.out.println(max);
System.out.println(min);
	}

}
