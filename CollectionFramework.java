package com.mbdri;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionFramework {
	public static void main(String[] args) {
		//HashMap<Integer, String> l1= new HashMap<>();
		HashMap<String, Integer> l1= new HashMap<>();
		//l1.add(null);
		/*
		 * l1.put(0,null); l1.put(11,null); l1.put( 7,"seven"); l1.put( 5,"five");
		 * l1.put( 1,"one"); l1.put( 3,"three"); l1.put( 2,"two"); l1.put( 6,"six");
		 * l1.put( 9,"nine"); l1.put( 10,"nine"); l1.put( 112,"nine"); l1.put(
		 * 8,"eight");
		 */
		l1.put(null, 0);
		l1.put(null, 0); 
		
		l1.put("one",1);
		l1.put("two", 2);
		l1.put("three", 3);
		l1.put("four", 4);
		l1.put("four", 4);
		
		
		System.out.println(l1);
		
		
	}

}
