package com.InterviewQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "cat cat dog dog rat";
	  HashMap<String, Integer>map=new HashMap<String, Integer>();
	  for(String word: str.split(" ")) {
		  if(map.containsKey(word)) {
			  map.put(word, map.get(word)+1);
		  }
		  else {
			  map.put(word, 1);
		  }
	  }
	    System.out.println(map);
	    for(String dup:map.keySet()) {
	    	if(map.get(dup)>1) {
	    		System.out.println(dup);
	    	}
	    }
	  String a = "ashyrova";
	        
	        Map<Character, Integer> mp = new LinkedHashMap();
	         for (char ch : a.toCharArray()) {
	             if (mp.containsKey(ch)) {
	                 mp.put(ch, mp.get(ch) + 1);
	             } else {
	                 mp.put(ch, 1);
	             }
	         }
	         System.out.println(mp);   // Output: {a=2, s=1, h=1, y=1, r=1, o=1, v=1}
	         for (char dupChar : mp.keySet()) {
	             if (mp.get(dupChar) > 1) {
	                 System.out.println(dupChar); // Output: a
	             }
	         }
	}

}
