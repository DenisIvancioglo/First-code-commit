package com.class11;

public class CountryCapital {
public static void main(String[]  args) {
	String[] countries= { "Russia", "USA"};
	for(int i=0; i<countries.length; i++){
		
		
        
            if(countries[i].equals("USA")) {
                System.out.println("Capital is Washington");
            }
            if(countries[i].equals("Russia")) {
                System.out.println("Capital is Moscow");
            }
		
	}
	for(String capitals:countries) {
		System.out.println("Washington, Moscow");
		break;
        }
	
}
}
