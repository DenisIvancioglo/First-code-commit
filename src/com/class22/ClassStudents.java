package com.class22;

public class ClassStudents {

	public String name;
	int a,b,c;
	public void  average() {
		System.out.println(name+" your average mark is "+(a+b+c)/3);
		
		
		
	}
	private ClassStudents(String n,int o, int t, int th ){
		name=n;
		a=o;
		b=t;
		c=th;
	}
	public static void main(String[] args) {
		ClassStudents obj1=new ClassStudents("Denis",5,5,5);
		obj1.average();
		ClassStudents obj2=new ClassStudents("Ali",5,5,5);
		obj2.average();
		ClassStudents obj3=new ClassStudents("Anar",7,8,9);
		obj3.average();
		ClassStudents obj4=new ClassStudents("Tayyab",10,12,15);
		obj4.average();
		ClassStudents obj5=new ClassStudents("Denis",6,8,9);
		obj5.average();
	}
	
	
}
