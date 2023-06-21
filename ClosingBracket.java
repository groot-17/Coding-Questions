package com.practice;

import java.util.Scanner;
import java.util.Stack;

public class ClosingBracket {

	static public boolean m1(String brc) {
		// String brc = "{}[]()";
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < brc.length(); i++) {

			if (brc.charAt(i) == '}') {

				if (stack.peek() == '{') {
					stack.pop();
				} else {
					return false;
				}

			} else if (brc.charAt(i) == ']') {
				if (stack.peek() == '[') {
					stack.pop();
				} else {
					return false;
				}

			} else if (brc.charAt(i) == ')') {
				if (stack.peek() == '(') {
					stack.pop();
				} else {
					return false;
				}

			} else {
				stack.push(brc.charAt(i));
			}

		}
		if (stack.size() == 0) {
			return true;

		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		System.out.println(m1("{}[]("));

	}

}
