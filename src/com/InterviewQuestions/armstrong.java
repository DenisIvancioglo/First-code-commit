package com.InterviewQuestions;

public class armstrong {

	public static void main(String[] args) {
		isArmstrong(153);
        isArmstrong(541);

	}
public static void isArmstrong(int num) {
        
        System.out.println(num);
        
        int remainder;
        int sumOfCubes = 0;
        int originalValue=num;
        
        while(num>0) {
            remainder = num%10;
            sumOfCubes = sumOfCubes +(remainder*remainder *remainder);
            num = num/10;
        }
        
        if(originalValue==sumOfCubes) {
            System.out.println("given number is an Armstrong number");
        }else {
            System.out.println("given number is not an Armstrong number");
        }
    }
}
