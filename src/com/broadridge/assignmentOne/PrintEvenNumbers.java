package com.broadridge.assignmentOne;

public class PrintEvenNumbers {
/*	9. Write a program to print only even numbers till 50.	*/
	
	static void printEvenNumbersTillFifty() 
	{	
		System.out.println("|||||||||| printEvenNumbersTillFifty : start ||||||||||");
		int value =50;
		System.out.print("Even Numbers from 1 to "+value+" are: ");
		for (int i = 1; i <= value; i++) {
		   //if number%2 == 0 it means its an even number
		   if (i % 2 == 0) {
			System.out.print(i + " ");
		   }
		}
		System.out.println("");
		System.out.println("|||||||||| printEvenNumbersTillFifty : end ||||||||||");
	}	
	
}
