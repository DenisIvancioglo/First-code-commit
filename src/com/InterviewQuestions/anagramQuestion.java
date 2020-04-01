package com.InterviewQuestions;

import java.util.Arrays;

public class anagramQuestion {
	public static void main(String[] args) {
        String str1 = "keep";
        String str2 = "peek";
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        
        String a=char1.toString();
        
        String newStr = new String(char1);
        String  newStr2 = new String(char2);
     
                
               
          
        System.out.println(newStr);
        System.out.println(newStr2);
        if (newStr.equalsIgnoreCase(newStr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }
    }
}






