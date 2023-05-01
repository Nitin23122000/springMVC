package com.practice;

import java.util.Iterator;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Runtime rs=Runtime.getRuntime();
		try {
			rs.exec("notepad");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}}
