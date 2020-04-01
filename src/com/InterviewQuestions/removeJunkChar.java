package com.InterviewQuestions;

public class removeJunkChar {

	public static void main(String[] args) {
		
		String x="%@$%#@%$hello*^%*Java";
		x=x.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(x);

	}

}
