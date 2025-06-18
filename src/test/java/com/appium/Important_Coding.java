package com.appium;

public class Important_Coding {
	
//	String reverse & it is palindrome - Done
//	Array reverse - Done
//	Storing in Array
//	Number reverse & it is palindrome - Done
//	Give Number is prime or not - Done
//	Fibonacci Series - Done
//	Find the minimum number in the array - Done
//	Find the maximum number in the array - Done
//	Swap two number in the variable without using third variable - Done
//	Occurance of all char (Eg: a,e,i,o,u) - Done
//	Remove space in the given string
//	Find upper and lower case in the give string - Done
//	Left side Triangle pattern using stars & number/Right side Triangle pattern using stars & number
//	Roman Numbers

	public static void main(String[] args) {
		
		// Right side triangle
		
		int n = 5;
		for(int i=0;i<n;i++) {
			for(int j=(n-i);j>=0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
