package com.broadridge.assignmentThree;
import java.util.Scanner;
public class ContainsBrown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a sentence - ");
        String str = sc.nextLine(); 
        if(str.contains("brown"))
        {
        	   System.out.print(str +"  contains word 'brown'."); 
        }	
        else {
        	   System.out.print( str +"  doesn't contain word 'brown'"); 
        }
      

	}

}