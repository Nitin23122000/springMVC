package com.practice;

public class nitin {
	public static void main(String[] args) {
		String s="Nit";
		s=s.toLowerCase();
		int start=0;
		int end=s.length()-1;
		while(start<end) {
			if(s.charAt(start)!=s.charAt(end)) {
				System.out.println("String is not palindrome");
				return;
			}
			start++;
			end--;
		}
		System.out.println("String is Palindrome");
	}

}
