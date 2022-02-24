package com.capg.packages.String;

import java.util.StringTokenizer;

public class test3 {
public static void main(String[] args) {
	StringTokenizer st = new StringTokenizer("this is a test");
    while (st.hasMoreTokens()) {
        System.out.println(st.nextToken());
    }

}
}
