package com.mbdri;

import java.util.Stack;

public class Brackets {
	public static void main(String[] args) {
		String s1="[]{}()<>{}";
		
		Stack stack =new Stack<>();
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='[') {
				for(int j=i+1;j<s1.length();j++) {
					if(s1.charAt(j)==']') {
						return true;
					}
				}
				return false;
				
			}
		}
	}

}
