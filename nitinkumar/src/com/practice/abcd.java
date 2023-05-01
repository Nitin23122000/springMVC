package com.practice;

import java.util.Random;
import java.util.Scanner;

public class abcd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		Random t=new Random();
		for(n=0;n<=10;n++) {
			System.out.println(t.nextInt(100));
		}
	}

}
