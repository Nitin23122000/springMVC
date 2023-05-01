 package com.practice;

public class lengthAndconcat {
	public static void main(String[] args) {
		int n;
		String s1="my name is nitin",s2,s3;
		n=s1.length();
		System.out.println("Number of Characters  : "+n);
		s1=s1.replace("my", "My");
		System.out.println(s1);
		
		s3=s1.concat("prajapat");
		System.out.println(s3);
		
	}

}
