package com.mbdri;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
	public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

      Consumer<String> counsumerConsumer=s->System.out.println(s);
	       counsumerConsumer.accept("vipin");
	       
	}
	
}
