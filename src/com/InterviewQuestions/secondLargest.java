package com.InterviewQuestions;

import java.util.Arrays;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {123456,12345,1341,34,43,13412,43};
int max1 =arr[0];
int max2=0;
int min=arr[0];

for(int i=0; i<arr.length;i++) {
	if(arr[i]<max1 && arr[i]>max2) {
		max2=arr[i];
	}
	if(arr[i]>max1) {
		max2=max1;
		max1=arr[i];
	}
	if(arr[i]<min) {
		min=arr[i];
	}
}
Arrays.sort(arr);
System.out.println(arr[arr.length-2]);
System.out.println(max1);
System.out.println(max2);
System.out.println(min);
	}

}
