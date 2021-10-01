package com.broadridge.assignmentOne;

public class PrintTriangle {
	
	/**	10. Write a program to print this output using a two-dimensional array.
	Triangle Array
	 0
	 00
	 000
	 0000
	 00000
	 000000
	 0000000
	 00000000
	 000000000
	0000000000  **/
	
	static void print2DTraingleArray(int value) 
	{	
		System.out.println("|||||||||| print2DTraingleArray : start ||||||||||");
		System.out.println("Value is : "+ value);
		 int i,j;
		 for ( i =1; i<= value ;i++)  
		{	 System.out.println("");	
		     for ( j =1; j<= i ;j++)			 
		      {  System.out.print("*");}
		}
		 System.out.println("");
		 System.out.println("|||||||||| print2DTraingleArray : end ||||||||||");
	}
}
