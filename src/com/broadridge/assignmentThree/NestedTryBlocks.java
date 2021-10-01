package com.broadridge.assignmentThree;

public class NestedTryBlocks {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("divide");
				int b = 100 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}

			try {
				System.out.println("Array");
				int a[] = new int[10];
				a[10] = 8;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}