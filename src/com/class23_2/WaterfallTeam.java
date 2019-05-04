package com.class23_2;
import com.class23.Employee;

public class WaterfallTeam extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterfallTeam wt=new WaterfallTeam();
		wt.salary=12000;// can access protected values from different package through inheritance
		//wt.salary;// default values cannot be access in different package;
		wt.mvp();
		//multiple inheritance is not available through the classes

	}

}
