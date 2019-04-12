package com.class20;

public class Employee {
  String eID;
  int salary;
  static String CEO="Sumair";
  public static void main(String[] args) {
	  Employee obj1=new Employee();
	  Employee obj2=new Employee();
	  obj1.eID="Denis Ivancioglo";
	  obj1.salary=20000;
	  obj2.eID="Alijon Nazarov";
	  obj2.salary=200000;
	  System.out.println(obj1.eID+" "+obj1.salary+"$ "+CEO);
	  System.out.println(obj2.eID+" "+obj2.salary+"$ "+CEO);
}
}
