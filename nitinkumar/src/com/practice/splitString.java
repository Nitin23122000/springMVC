package com.practice;

public class splitString {
	public static void main(String[] args) {
		String s1="My name is nitin";
		String[] split=s1.split("");
		for(String w: split) {
			System.out.println(w);
		}
	}

}
