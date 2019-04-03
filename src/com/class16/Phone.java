package com.class16;

public class Phone {
	//attributes: brand, speaker, battery;
	//behavior; call, playmusic, watchmovie;
	String brand;
	int speaker, battery;
	boolean call, playMusic, watchMovie;
public static void main(String[] args) {
	Phone iphone=new Phone();
	iphone.brand="Apple";
	iphone.speaker=2;
	iphone.battery=1;
	iphone.call=true;
	iphone.playMusic=true;
	iphone.watchMovie=true;
	iphone.faceId();
	
	Phone android= new Phone();
	android.brand="Samsung";
	android.speaker=3;
	android.battery=1;
	android.call=true;
	android.playMusic=true;
	android.watchMovie=true;
	
	Phone nokia=new Phone();
	nokia.brand="Nokia";
	nokia.speaker=4;
	nokia.battery=2;
	nokia.call=true;
	nokia.playMusic=true;
	nokia.watchMovie=false;
			
}
void faceId() {
	System.out.println("Unlock with Faceid");
}
}
