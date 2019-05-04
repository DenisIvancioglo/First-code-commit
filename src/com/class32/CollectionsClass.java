package com.class32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> integerList=new ArrayList<>();
integerList.add(90);
integerList.add(33);


System.out.println("before collections"+integerList);
Collections.sort(integerList);
System.out.println("after collections"+integerList);

int[] integerArray= {12,54,6544,1};
Arrays.sort(integerArray);
for(int num:integerArray) {
	System.out.print(num+" ");
}
	}

}
