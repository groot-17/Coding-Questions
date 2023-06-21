package com.practice.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Frequency {

	/*
	 * public static void main(String[] args) { String names =
	 * "RAM RAJ RAJ RAM ROHAN"; String[] arr =names.split(" "); for(String s:arr) {
	 * System.out.println(s); }
	 */

	/*
	 * for(Map.Entry<String,Integer> m: map.entrySet()) {
	 * System.out.println(m.getKey()+":"+m.getValue()); } } map.entrySet().stream().
	 */
	/*
	 * public static void main(String[] args) { String s1 ="aabudwhdk";
	 * 
	 * Map<Character,Integer> map = new HashMap<>();
	 * 
	 * 
	 * for(int i=0;i<s1.length()-1;i++){ if(map.containsKey(s1.charAt(i))){
	 * map.put(s1.charAt(i),map.get(s1.charAt(i))+1); } else{
	 * map.put(s1.charAt(i),1); }
	 * 
	 * } System.out.println(map); }
	 */

	/*
	 * public static void main(String[] args){ Map<Integer,String> map = new
	 * HashMap<>(); map.put(3,"Three"); map.put(5,"Five"); map.put(2,"Two");
	 * map.put(1,"One"); map.put(7,"Seven");
	 * 
	 * map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.
	 * reverseOrder())).forEach(System.out::println);
	 * 
	 * }
	 */
	/*
	 * public static void main(String[] args){ String s1 = "Today is Monday"; int
	 * count = 0; for(int i=s1.lastIndexOf(" ");i<s1.length()-1;i++){ count++; }
	 * System.out.println(count); }
	 */

	/*
	 * public static void main(String[] args){ List<Integer> l1 =
	 * Arrays.asList(1,21,11,-11,43,22,76,54,13,17);
	 * l1.stream().map(m->m+" ").filter(n->n.startsWith("1")).forEach(System.out::
	 * println);
	 * 
	 * }
	 */
	/*
	 * public static void main(String[] args){ List<Integer> l1 =
	 * Arrays.asList(1,21,11,-11,43,22,76,11,22); Set<Integer> s1 = new HashSet<>();
	 * l1.stream().filter(m->!s1.add(m)).forEach(System.out::println);
	 * 
	 * }
	 */
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(11, 21, 32, -44, 73, 85, -54, 88, 15);
		List<String> s1 = Arrays.asList("abc", "df", "fgh", "klm", "akze");
		Set map = new HashSet<>();
		// Q1
		l1.stream().map(t -> t + " ").filter(m -> m.startsWith("1")).forEach(System.out::println);
		// Q3
		l1.stream().findFirst();
		// Q2
		l1.stream().filter(m -> !map.add(m)).forEach(System.out::println);
		// Q4
		long count = l1.stream().count();
		System.out.println(count);
		// Q5
		long max = l1.stream().max(Integer::compare).get();
		// Q6
		l1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		// Q8
		l1.stream().filter(m -> m > 0).sorted().forEach(System.out::println);
		// Q7
		double sum = l1.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum / l1.size());
		// Q9
		s1.stream().filter(m -> m.startsWith("a")).forEach(System.out::println);
		// Q10
		l1.stream().map(m -> m + " ").filter(m -> m.startsWith("2")).forEach(System.out::println);
		// Q11
		l1.stream().map(m -> m + " ").filter(m -> m.length() == 2).forEach(System.out::println);
		// Q12
		l1.stream().map(m -> m + " ").filter(m -> m.endsWith("2")).forEach(System.out::println);
	}

}
