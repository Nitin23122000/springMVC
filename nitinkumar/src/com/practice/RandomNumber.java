package com.practice;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		int n;
		Random t=new Random();
		for( n=0;n<=10;n++) {
			System.out.println(t.nextInt(100));
			
		}
	}

}
