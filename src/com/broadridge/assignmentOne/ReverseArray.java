package com.broadridge.assignmentOne;

import java.util.Scanner;

public class ReverseArray {
	/* 8. Write a program to reverse the elements of an array where the array size as well as the
	 array values are entered by the user.	*/
	
	static void reverseArray() 
	{	
		System.out.println("reverseArray() : Start ");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter array size");
		    String Size = myObj.nextLine();  // Read user input
		    System.out.println("Size is : " + Size); 
		    int arraySize=Integer. parseInt(Size); 	    	
		    String[] arr = new String[arraySize];
		    for (int i=0;i<arraySize;i++)
		    {
				    System.out.println("Enter next element in array");
				    String arrElement = myObj.nextLine();   
				    arr[i] = arrElement;
		    } 
		    System.out.println("End of Input");
			int i=0;
			
			System.out.print("Input,  Array before reversing : ");
			for(i= 0 ;i<arraySize;i++ ) 
			{
				System.out.print(arr[i]);
				System.out.print(" , ");
			}
			System.out.println("");
		int j =0;
		String[] arr1 = new String[arraySize];
		for( i= arraySize-1 ;i>=0;i-- )
		{
		arr1[j] = arr[i];
		j++;
		}
		System.out.print("Output,  Array after reversing : ");
		for(i= 0 ;i<arraySize;i++ ) 
		{
			System.out.print(arr1[i]);
			System.out.print(" , ");
		}
		System.out.println(" ");
		System.out.println("reverseArray() : end ");
	}
	

	
}
