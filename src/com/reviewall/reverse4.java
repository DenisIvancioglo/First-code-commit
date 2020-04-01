package com.reviewall;

public class reverse4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello moto";

char[] array=s.toCharArray();
String rev="";

for(int i=array.length-1; i>=0; i--) {
	rev=rev+array[i];
}

System.out.println(rev);

StringBuffer sb= new StringBuffer(s);
System.out.println(sb.reverse());
	}

}
