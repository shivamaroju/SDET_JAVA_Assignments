package com.broadridge.assignmentOne;

/* 7. Write a program to print the sum of the first 20 natural numbers. */

public class SumOf20Numbers {

	static void sumOfFirst20Numbers() 
	{	
		System.out.println("|||||||||| sumOfFirst20Numbers : start ||||||||||");
	int sum, n;
	n=20;
	sum = (n * (n + 1) ) / 2; 
	System.out.println("sum of first "+n+" natural numbers is : "+sum );
	System.out.println("|||||||||| sumOfFirst20Numbers : end ||||||||||");
	}
}
