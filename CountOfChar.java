package com.mbdri;

import java.util.HashMap;
import java.util.Map;

public class CountOfChar {
	public static void main(String[] args) {
	String s1=new String("kwhfihsffifksdwd");
	Map<Character,Integer> map = new HashMap<>();
	
	for(int i=0;i<s1.length();i++) { 
		char element=s1.charAt(i);
		if(map.containsKey(element)) {
			map.put(element, map.get(element)+1);
		}
		else {
			map.put(element, 1);
		}
		
	}
	for (Map.Entry<Character,Integer> entry : map.entrySet()) {
		if(entry.getValue()>2) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
		
	}
	
	}
}
