package com.practice;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,z,count=0,digit,sum=0,pro;
		System.out.println("enter a number : ");
		n=sc.nextInt();
		z=n;
		while(z>0) {
			count=count+1;
			z=z/10;
		}
		System.out.println("Number of Digit are : "+count);
		
		z=n;
		
		while(z>0) {
			digit=z%10;
			pro=1;
			for(int i=1;i<=count;i++)
				pro=pro*digit;
			    sum=sum+pro;
			    z=z/10;
		}
		if(sum==n) {
			System.out.println("Your Number is Armstrong");
		}
		else {
			System.out.println("Your Number is not Armstrong");
		}
			
		
	}

}
