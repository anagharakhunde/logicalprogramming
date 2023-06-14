package com.jsp.logicalprogramming;

public class Fibonacci {
	public static void main(String[]args) {
		int x=0; int y=1;int z=0;int n=8;
		while(z<=n) {
			System.out.println(z);
			x=y;
			y=z;
			z=x+y;

		}
	}
	}
