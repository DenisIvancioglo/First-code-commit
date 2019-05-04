package com.class29;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj=new Student();
obj.name="John";
obj.age=17;

obj.setName("Denis");
obj.setAge(14);
System.out.println(obj.getName()+" is my name "+obj.getAge()+" is my age");
	}

}
