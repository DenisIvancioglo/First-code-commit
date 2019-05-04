package com.class23_2;

class Main {

	  static int count=0;
	   public void print(){
	   count++;
	  }
	  public static void main(String[] args) {
	    Main obj=new Main();
	   
	   
	    Main obj1=new Main();
	    Main obj2=new Main();
	    obj.print();
	    obj1.print();
	    obj2.print();
	    
	   System.out.println(count);
	     System.out.println(count);
	      System.out.println(count);
	   
	  }
	}