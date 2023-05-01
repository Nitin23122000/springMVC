package com.practice;

public class patternpractice {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<=5;i++) {
			
			  for(int k=0;k<=5-i;k++)
			  { 
				  System.out.print(" "); }
			
			for(int j=1;j<=i;j++) {
				System.out.print(" "+i++);
			}
			System.out.println();
		}
	}

}
