package com.class27;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Phone phone1= new iPhone();
phone1.makeCall();
phone1.sendText();
phone1.unlockPhone();
phone1.viewPictures();

Phone ph=new Samsung();
ph.makeCall();
ph.sendText();
ph.unlockPhone();
ph.viewPictures();

	}

}
