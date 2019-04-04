package com.class16;

public class printVowels {
	 
	public static void main(String[] args) {
		printVowels print=new printVowels();
		print.vowelCountWithReplaceAll();
		print.world();
	}
	void world() {
		String vowels="hello world my name Is wEqas";
		char[] w=vowels.toCharArray();
		char empty;
		for(int i=0; i<w.length; i++) {
			if(w[i]=='a'||w[i]=='A'||w[i]=='e'||w[i]=='E'||w[i]=='i'
                    || w[i]=='I'||w[i]=='o'||w[i]=='O'||w[i]=='u'||w[i]=='U') {
                empty=w[i];
                System.out.print(empty+",");
            }
		}
	}
	void vowelCountWithReplaceAll() {
        String weqas="hello world my name Is wEqas";
        String replace =weqas.replaceAll("[^aA,eE,iI,oO,uU]", "");
        //String replace =string.replaceAll("[^aA,eE,iI,oO,uU]", "");

        System.out.println(replace);
    }
}
