package com.practice;

import java.util.Scanner;

public class FactorialProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,fact=1;
		System.out.println("enter n: ");
		n=sc.nextInt();
		while(n>0) {
			fact=fact*n;
			n=n-1;
		}
		System.out.println("Factorial : "+fact);
	}
}
