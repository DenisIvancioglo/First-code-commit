package com.InterviewQuestions;

public class interview {

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,8};
	
		
		for(int j=0; j<arr.length; j++)
		for(int i=j+1; i<arr.length; i++)
		if(arr[j]+arr[i]==12) {
			System.out.println(true+" "+arr[j]+" + "+arr[i]);
		}

	}
	

	

}
