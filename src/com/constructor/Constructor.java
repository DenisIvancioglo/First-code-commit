package com.constructor;

public class Constructor {
	String name;
	 int a, b;
	
	public int largest() {
		if(a>b) {
		return a;
		} else {
			return b;
		}
				
	}
	Constructor(String n){
		name=n;
		
	}
Constructor(int c, int d){
	a=c;
	b=d;
}

   Constructor(){
	a=10;
	b=11;
	if(a>b) {
		System.out.println(a);
	}else {
		System.out.println(b);
	}
}

	

 
}
