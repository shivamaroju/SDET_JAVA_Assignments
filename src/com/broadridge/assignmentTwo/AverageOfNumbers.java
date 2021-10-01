package com.broadridge.assignmentTwo;

import java.util.Scanner;

public class AverageOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt(); 
        
        int arr[] = new int[n];
        for(int i = 1; i <= n; i++){
        	System.out.print("Enter element : "+i+"  : ");
            arr[i-1] = sc.nextInt();
        }
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	sum += arr[i];
        }
        
        float result = sum/arr.length;
        
        System.out.print("Average of Numbers : "+result);

}
}
