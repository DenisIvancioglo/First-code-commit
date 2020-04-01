package com.InterviewQuestions;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();

        int firstDigit = num % 10;
        
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);
        System.out.println(firstDigit);
        System.out.println(SecondDigit);
        System.out.println(thirdDigit);
        System.out.println(fourthDigit);
        System.out.println(remainingNumber);
      
            int a = 12345;
            int b = 0;

            String convert = String.valueOf(a);
            char[] c = convert.toCharArray();
            for (int i = 0; i < convert.length(); i++) {

                 b = b + Character.getNumericValue(c[i]);
            }
            System.out.println(b);
        }
	}


