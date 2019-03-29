package com.class5;

public class LiogicalOr {
	public static void main(String[] args) {
	/*we have 7 days a week
	 * if days are from 1-5 -->weekday
	 * if days are from 6-7 --->weekend
	 * otherwise"NOt a valid day"
	 	
	 */
		int day=5;
		
		if (day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("It is a week day");
		}else if(day==6 || day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Not a valid day");
		}
	}

}
