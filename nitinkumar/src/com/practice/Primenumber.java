package com.practice;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,count=0,i;
		System.out.println("enter n : ");
		n=sc.nextInt();
		i=1;
		while(i<=n) {
			if(n%i==0) {
				count=count+1;
			}
			i=i+1;
		}
		if(count==2) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not prime");
		}
	}

}
