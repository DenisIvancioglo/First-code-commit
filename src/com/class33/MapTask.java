package com.class33;

import java.util.*;

public class MapTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> build=new HashMap<>();
build.put(1, "Google");
build.put(2, "Syntax");
build.put(3, "Apple");
build.put(4, "Putin");
build.put(5, "Kremlin");
build.put(6, "Sikander");
build.put(7, "Microsoft");
System.out.println(build.size());
build.replace(4,"France");
build.remove(7);

System.out.println(build);

	}

}
