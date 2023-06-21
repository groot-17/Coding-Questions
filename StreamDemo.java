 package com.practice.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Vipin");
		l1.add("Kshitiz");
		l1.add("Vivek");
		l1.add("Kajal");
		l1.add("yashraj");
		
		//l1.stream().forEach(t->System.out.println(t));
		//l1.stream().filter(t->t.startsWith("V")).forEach(obj->System.out.println(obj));
		
		Map<String , Integer> map = new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 5);
		
		//map.forEach((key,value)->System.out.println(key+":"+value));
		//map.entrySet().stream().forEach(obj->System.out.println(obj));
		map.entrySet().stream().filter(v->v.getValue()%2==0).forEach(x->System.out.println(x));
	}

}
