package com.class20;

public class SplitArray {
private String str(String name) {
	String[] a=name.split(" ");
	String e="";
	
	for(int i=0; i<a.length; i++) {
		e=e+a[i]+"\n";
		
	}
return e;
	 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SplitArray obj=new SplitArray();
System.out.println(obj.str("Hey whassup guys"));
	}

}
