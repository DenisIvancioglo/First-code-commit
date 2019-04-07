package pack1;

public class Minimum {

	//int my_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	static int minOfValues(int my_array[] ) {
		int min=my_array[0];
		int max=my_array[0];
		for(int i=0; i<my_array.length; i++) {
			 
				if(my_array[i]<min) {
					min=my_array[i];
				}
				if(my_array[i]>max) {
					max=my_array[i];
				}
			}
		
		return max;
	}
}
