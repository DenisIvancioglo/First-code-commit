package com.class5;

import java.util.Scanner;

public class score {
	public static void main(String[] args) {
		Scanner input;

		int quiz, midterm, finalexam, average;

		input = new Scanner(System.in);

		System.out.println("Quiz score");
		quiz = input.nextInt();
		System.out.println("midterm score");
		midterm = input.nextInt();
		System.out.println("final exam score");
		finalexam = input.nextInt();
		average = (quiz + midterm + finalexam) / 3;

		if (average >= 90 && average <= 100) {
			System.out.println(average + "\n your grade is A");
		} else if (average >= 70 && average < 90) {
			System.out.println(average + "\n your grade is B");
		} else if (average >= 50 && average < 70) {
			System.out.println(average + "\n your grade is C");
		} else if (average < 50) {
			System.out.println(average + "\n your grade is F");
		}

	}

}
