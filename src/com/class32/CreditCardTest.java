package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class CreditCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Visa visa=new Visa("Visa Platinum");

AX ax=new AX("AX Rewards");

MasterCard mc=new MasterCard("MC basic");

ArrayList<CreditCard> alist=new ArrayList<>();
alist.add(visa);
alist.add(ax);
alist.add(mc);

for(CreditCard card:alist) {
	System.out.println(card.creditCardName);
	card.interestRate();
	card.annualFee();
}

Iterator <CreditCard> myIterator=alist.iterator();
//while(myIterator.hasNext()) {
//	CreditCard obj=myIterator.next();
//
//	System.out.println(myIterator.next().creditCardName);
//	obj.annualFee();
//}
for(int i=0; i<alist.size(); i++) {
CreditCard obj=alist.get(i);
obj.annualFee();
}


	}

}
