package com.class36;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuffer sb=new StringBuffer("Hello");
//		
//		sb.deleteCharAt(3);
//		
//		System.out.println(sb);
		
		String str="Good morning";
		str = str.concat(" John");//str=new String("Good morning John")
		System.out.println(str);
		
		System.out.println("------------");
		
		StringBuffer sb=new StringBuffer("Good morning");
		sb.append(" John");
		sb.reverse();
		
		System.out.println(sb);
	}

}
