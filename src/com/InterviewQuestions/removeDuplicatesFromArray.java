package com.InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String[] arr= {"java","ruby","C#","java"};
//
//
//Set<String>hash=new HashSet();
//
//for(int i=0; i<arr.length;i++) {
//	
//	if(hash.add(arr[i])==false) {
//		System.out.println(arr[i]);
//	}
//}
//System.out.println(hash);
//char a='c';

String ann="anar";
char[] ar=ann.toCharArray();

Set<Character>hashset=new HashSet();
for(int i=0; i<ar.length;  i++) {
	
	if(hashset.add(ar[i])==false) {
		System.out.println(ar[i]+" is a duplicate character");
	}
}



	}

}
