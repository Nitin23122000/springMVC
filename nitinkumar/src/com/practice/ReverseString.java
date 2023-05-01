package com.practice;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str,rev="";
		int length;
		System.out.println("Enter a string : ");
		str=sc.nextLine();
		length=str.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
			
		
	}

}
