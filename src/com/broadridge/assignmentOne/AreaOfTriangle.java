package com.broadridge.assignmentOne;

import java.util.Scanner;
/*6. Write a program to calculate the area of a triangle. Users will enter the values for
base and height of the triangle.*/
public class AreaOfTriangle {
	public static void main(String[] args) {
 
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter base value");
	    int base = myObj.nextInt();  // Read user input
	    System.out.println("Enter height value");
	    int height = myObj.nextInt();
	    System.out.println("Triangle Dimension are , base = "+ base +" & height = "+ height);
	    int area = (base*height)/2;
	    System.out.println("Area Of Triangle = "+area);
	}
}
