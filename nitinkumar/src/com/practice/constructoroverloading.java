package com.practice;

class java{
	 public void ab(){
		 System.out.println("First method");
	 }
	 public void ab(int i) {
		 System.out.println("parameterized method" +i);
	 }
	 java(){
		 System.out.println("constructor Method Called");
	 }
	 java(int j){
		 System.out.println("parameterized Constructor" +j);
	 }
}
class spring extends java{
	public void ab(){
		System.out.println("derived method Called");
	}
}


public class constructoroverloading {
	public static void main(String[] args) {
		java j=new java();
		new java(6);
		j.ab();
		j.ab(5);
		spring s=new spring();
		s.ab();
		
	}

}
