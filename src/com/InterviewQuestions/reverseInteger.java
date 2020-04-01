package com.InterviewQuestions;

public class reverseInteger {

	public static void main(String[] args) {
		int num=12345;
		int rev=0;
		while(num !=0) {
			rev=rev*10+num%10;//
			num=num/10;//1234,5
		}
		
		for(int i=1; i<=30; i++) {
			if(i%3==0) {
				System.out.println(i+" donkey");
			}
			if(i%5==0) {
				System.out.println(i+" monkey");
			}
		}
	
	}

}
