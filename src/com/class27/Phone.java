package com.class27;

public abstract class Phone {// abstract class

	public void makeCall() {
		System.out.println("Phone can make a call");
	}
	
	public void sendText() {
		System.out.println("Phone can text");
	}
	public abstract void unlockPhone();
	public abstract void viewPictures();
}
class iPhone extends Phone{//concrete class- is class that is inherited from a abstract class or
	//class or implemented by interface and providing implementation of all
	// unimplemented/abstract classes

	@Override
	public void unlockPhone() {
		System.out.println("FaceId");
		
	}

	@Override
	public void viewPictures() {
		System.out.println("Pictures");
		
	}
	
}

class Samsung extends Phone{

	@Override
	public void unlockPhone() {
		// TODO Auto-generated method stub
		System.out.println("Samsung FaceId");
	}

	@Override
	public void viewPictures() {
		// TODO Auto-generated method stub
		System.out.println("Samsung pictures");
	}
	
}