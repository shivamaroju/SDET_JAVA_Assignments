package com.broadridge.assignmentTwo;
import java.util.Scanner;

public class FindOddNumbers
{

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);  
	        System.out.print("Enter start of range : ");
	        int start = sc.nextInt(); 
	        System.out.print("Enter end of range : ");
	        int end = sc.nextInt(); 
	        System.out.println("|||||||||| Odd Numbers in the given range ||||||||");
	        for(int i = start; i <= end; i++) {
	        	if(i%2 != 0) {
	        		System.out.print(i+" ");
	        	}
	     }

}
}

 