package com.practice;

import java.util.Scanner;

public class Indexing {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1="My name is Nitin";
		System.out.println(s1.endsWith("in"));
		int index1=s1.indexOf("is");
		System.out.println(index1);
	}

}
