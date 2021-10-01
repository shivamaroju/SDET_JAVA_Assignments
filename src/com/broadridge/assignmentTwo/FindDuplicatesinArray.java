package com.broadridge.assignmentTwo;

import java.util.Scanner;

public class FindDuplicatesinArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt(); 
        
        int arr[] = new int[n];
        for(int i = 1; i <= n; i++){
        	System.out.print("Enter element : "+i+" :");
            arr[i-1] = sc.nextInt();
        }
        
        System.out.println(" ||||||||||||||||||||||||||| ");
        for(int i = 0; i < arr.length; i++) {
        	for(int j = i+1; j < arr.length; j++) {
        		if(arr[i] == arr[j]) {
        			System.out.print("duplicate elements : " + arr[j] + " ");
        			System.out.println("");
        			System.out.println(" ||||||||||||||||||||||||||| ");
        		}
        	}

	}

}
}
