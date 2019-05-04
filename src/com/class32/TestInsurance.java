package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class TestInsurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet p=new Pet("Geico");
		Health h=new Health("StateFarm");
		Car c=new Car("DenisInsurance");
		
		
ArrayList<Insurance> alist=new ArrayList();
alist.add(c);
alist.add(h);
alist.add(c);

Iterator<Insurance> al=alist.iterator();
while(al.hasNext()) {
	Insurance obj=al.next();
	System.out.println(obj.insuranceName);
	obj.cancelInsurance();
	obj.getQuote();
	
	
}
for(Insurance ins:alist) {
	System.out.println(ins.insuranceName);
	ins.getQuote();
	ins.cancelInsurance();
}
for(int i=0; i<alist.size();i++) {
Insurance obj=alist.get(i);
obj.cancelInsurance();
}
	}

}
