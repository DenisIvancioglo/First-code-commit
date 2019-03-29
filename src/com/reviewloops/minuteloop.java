package com.reviewloops;

public class minuteloop {
public static void main(String[] args) {
	for(int i=1; i<=30; i++ ) {
		if(i<10) {
		System.out.println("the time is 07:"+"0"+i+" min");
		continue;
		}else {
			System.out.println("the time is 07:"+i+" min");
		}
	}
	int n=1;
	while(n<=30) {
		if(n<10) {
			n++;
		System.out.println("the time is 07:"+"0"+n+" min");
		continue;
		}else {
			System.out.println("the time is 07:"+n+" min");
			n++;
		}
		
	}
}
}
