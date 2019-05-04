package com.class23;

public class ConsrtuctorOverloading {
	ConsrtuctorOverloading() {
        System.out.println("I am a constructor");
    }

	ConsrtuctorOverloading(String str) {
        System.out.println("with String parameter");
    }
	ConsrtuctorOverloading(String str, String str1){
        System.out.println("with 2 parameters");
    }
	ConsrtuctorOverloading(int a){
        System.out.println("with int");
    }

}
