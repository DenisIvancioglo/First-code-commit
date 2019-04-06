package com.class17;

public class Main {
	public static void main(String[] args){
	     Main husky=new Main();
	    husky.bark("Husky");
	    husky.run("Husky");
	    husky.play("Husky");
	    
	    
	    Main Bulldog=new Main();
	    Bulldog.bark("Bulldog");
	     Bulldog.run("Bulldog");
	      Bulldog.play("Bulldog");
	    
	    Main Labrador=new Main();
	     Labrador.bark("Labrador");
	     Labrador.run("Labrador");
	     Labrador.play("Labrador");
	    
	  }
	  void bark(String name){
	    System.out.println(name+" can bark");
	  }
	    
	  void run(String name){
	    System.out.println(name+" can run");
	  }
	  
	  void play(String name){
	        System.out.println(name+ " can play");
	  }
	  

	}

