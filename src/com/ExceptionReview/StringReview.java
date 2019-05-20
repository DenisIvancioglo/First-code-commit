package com.ExceptionReview;

public class StringReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abc";
str.concat("def");
System.out.println(str);
StringBuffer st=new StringBuffer(str);
st.append("def");
System.out.println(st);

StringBuilder bu=new StringBuilder("ghi");
bu.append(st);
System.out.println(bu);
	}

}
