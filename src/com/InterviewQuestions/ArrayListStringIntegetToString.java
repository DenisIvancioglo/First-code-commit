package com.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStringIntegetToString {
public static void main(String[] args) {
	List<Object>ls=new ArrayList<>();
	ls.add("adsads");
	ls.add("erfw");
	ls.add(23424);
	ls.add(1231);
	ls.add(1312);
	ls.add("wewfw");
	
	
	List<String>list=new ArrayList<>();
	for(Object ar:ls) {
	list.add(ar.toString());
	}
	list.retainAll(ls);
	System.out.println(list);
	
	}
//	for(int i=0; i<ls.size();i++) {
//		for(int j=0; j<list.size();j++) {
//			
//			if(((ls.get(i).equals(list.get(j)) && ls.get(i).toString().equalsIgnoreCase(list.get(j))))){
//				list.remove(list.get(j));
//				list.add(ls.get(i).toString());
////			
////				}
//			}
//			else if(!((ls.get(i).equals(list.get(j))))) {
//				list.remove(list.get(j));
			}
//			if(ls.get(i).equals(list.get(j))) {
//				list.add(list.get(j));
//				list.add(ls.get(i).toString());
//			}
//		}
//	}
	
	

	



