package com.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class names {

	public static void main(String[] args) {
		String name = "Ahmed";
        List<String> people = new ArrayList<>();
        people.add("Ahmed");
        people.add("John");
        people.add("Eric");
        people.add("Ahmed");
        people.add("Ahmed"); 
        people.add("Ahmed");
        people.add("Ahmed");
        people.add("Ahmed");

        for (int i=0; i<=people.size()-1; i++) {
            if (people.get(i).equals(name)) {
                people.remove(i);
            }
        }

        System.out.println(people);
        
        String name1 = "Ahmed";
        List<String> people1 = new ArrayList<>();
        people1.add("Ahmed");
        people1.add("John");
        people1.add("Eric");
        people1.add("Ahmed");
        people1.add("Ahmed");
        people1.add("Ahmed");
        List<String> blacklist = new ArrayList<>();
        for (String p : people1) {
            if (p.equals(name1)) {
                blacklist.add(p);
            }
        }
        people1.removeAll(blacklist);
        System.out.println(people1);
        
        int num=100;
        List<Integer>list = new ArrayList<Integer>();
        list.add(200);
        list.add(12);
        list.add(123);
        list.add(34);
        for (int i=0; i<=list.size()-1; i++) {
            if (list.get(i)>(num)) {
            	list.remove(i);
            }
        }
        System.out.println(list);
	}

}
