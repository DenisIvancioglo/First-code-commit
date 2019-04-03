package com.class16;

public class Computer {
	String  os, brand;
	int ram, screen;
	boolean keyboard, mouse;
	
public static void main(String[] args) {
	
	Computer comp1=new Computer();
	
	comp1.mouse=true;
	comp1.keyboard=true;
	comp1.ram=8;
	comp1.os="Windows";
	comp1.screen=2;
	comp1.brand="Mac";
	comp1.watchMovie();
	comp1.playMusic();
	comp1.doJavaCoding();

}
void watchMovie() {
	System.out.println("We can watch movie on a computer "+brand);
}
void doJavaCoding() {
	System.out.println("We can do Java coding on our computer");
}
void playMusic() {
	System.out.println("We can play music on our computer");
}
}
