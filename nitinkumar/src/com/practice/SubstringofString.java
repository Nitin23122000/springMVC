package com.practice;

import java.util.Scanner;

public class SubstringofString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str,sub;
		int length;
		System.out.println("Enter a String : ");
		str=sc.nextLine();
		length=str.length();
		for(int i=0;i<=length;i++) {
			for(int j=1;j<=length-i;j++) {
				sub=str.substring(i,i+j);
				System.out.println(sub);
			}
		}
			
		
	}

}
