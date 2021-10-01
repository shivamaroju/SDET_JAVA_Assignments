package com.broadridge.assignmentOne;

import java.util.Scanner;

public class MainClass {
	 
		public static void main(String[] args) {
			 
			 
			/* PrintEvenNumbers
			
			
			AssignmentOne.printPyramid(4); 
			
			 ReverseArray.reverseArray() ;

			PrintTriangle.print2DTraingleArray(8);*/
			PrintEvenNumbers.printEvenNumbersTillFifty();
			SumOf20Numbers.sumOfFirst20Numbers();
		  }

	

	
	
	/**	my own program ____!!! 10. Write a program to print pyramid.
	   0
	  000
	 00000
	0000000
   000000000
  **/
	
	static void printPyramid(int value) 
	{	
		System.out.println("printPyramid : start ");
		System.out.println("Value is : "+ value);
		 int i,j;
		// System.out.print("*");
		 for ( i =1; i<= value ;i++)  
			
		{	    //System.out.println("i is : "+ i);
			System.out.println("");	
			 
		     for ( j =1; j != 2 * i - 1 ;j=j+2)		
		    	   
		      { // System.out.print("i is : "+ i +" "+"j is "+ j +" ");
		    	 System.out.print("*");}
		}
		 System.out.println("");
		 System.out.println("printPyramid : end ");
	}	
	
}
