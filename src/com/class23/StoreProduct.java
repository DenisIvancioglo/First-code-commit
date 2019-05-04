package com.class23;

public class StoreProduct {

	
	String label;
	int price;
	String category;
	boolean hasExpiration;
	int stock;
	StoreProduct(String l, int p, String c,boolean h, int s){
		label=l;
		price=p;
		category=c;
		hasExpiration=true;
		stock=0;
		System.out.println(l+" "+p+" "+c+" "+hasExpiration+" "+s);
		
	}
	StoreProduct(String la, int pr, int st){
		label=la;
		price=pr;
		category="misc";
		hasExpiration=false;
	stock=st;
		
		System.out.println(la+" "+pr+" "+category+" "+hasExpiration+" "+st);
		
	}
	StoreProduct(String lab, int pri){
		label=lab;
		price=pri;
	
		
	  
		
		System.out.println(lab+" "+pri+" "+category+" "+hasExpiration+" "+stock);
		
	}
	
	public static void main(String[] args) {
		StoreProduct obj=new StoreProduct("Eggs", 3, "Produce", true, 10);
		StoreProduct obj1=new StoreProduct("Paper Towels", 2, 24);
		StoreProduct obj2=new StoreProduct("Paper Towels", 2);

		System.out.println();
	}
	
	
}
