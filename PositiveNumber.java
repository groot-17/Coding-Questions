package com.practice.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PositiveNumber {
public static void main(String[] args) {
	List<Integer> l1 = Arrays.asList(11,14,13,45,20,-20);
	l1.stream().filter(s->s>0).sorted().forEach(System.out::println);;
	l1.stream().filter(a->a>0).sorted(Comparator.naturalOrder()).forEach(System.out::println);
}
}
