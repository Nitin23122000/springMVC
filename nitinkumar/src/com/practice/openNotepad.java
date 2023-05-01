package com.practice;

public class openNotepad {
	public static void main(String[] args) {
		Runtime rs= Runtime.getRuntime();
		try {
			rs.exec("notepad");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
