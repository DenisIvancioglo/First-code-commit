package com.class33;

import java.util.*;

public class BestBuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> bs=new HashMap<>();
bs.put(054353, "TV");
bs.put(013353, "LapTop");
bs.put(077323, "Refregerator");
bs.put(73822, "Headphones");

for(Map.Entry entry: bs.entrySet()) {
	System.out.println(entry.getKey()+": "+entry.getValue());
}
Iterator<Map.Entry<Integer, String>>it=bs.entrySet().iterator();
while(it.hasNext()) {
	Map.Entry<Integer,String> en=it.next();
	System.out.println(en.getKey()+": "+en.getValue());
}
	}

}
