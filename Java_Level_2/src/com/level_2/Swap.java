package com.level_2;

public class Swap {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("Before swapping numbers are:" +a +"  "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping numbers are:" +a +"  "+b);
	}
}
