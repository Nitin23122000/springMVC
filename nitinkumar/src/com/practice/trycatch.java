package com.practice;

import java.util.Scanner;

public class trycatch {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		i=sc.nextInt();
		System.out.println("Enter a Second number : ");
		j=sc.nextInt();
		try {
			k=i/j;
			System.out.println("Answer is : "+k);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Number cannot divided by zero");
		}
		
		finally {
			 {
			System.out.println("Code Runs successfully");
		}}
	}

}
