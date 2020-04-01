package com.InterviewQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "azmano";

		Map<Integer, Character> am = new HashMap();
		char[] arr = word.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ('a')) {
				am.put(0, arr[i]);
			}
			if (arr[i] == ('m')) {
				am.put(1, arr[i]);
			}
			if (arr[i] == ('a')) {
				am.put(2, arr[i]);
			}
			if (arr[i] == ('z')) {
				am.put(3, arr[i]);
			}
			if (arr[i] == ('o')) {
				am.put(4, arr[i]);
			}
			if (arr[i] == ('n')) {
				am.put(5, arr[i]);
			}
		}

		Iterator<Character> it = am.values().iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	 


	}

}
