package com.broadridge.assignmentThree;

public class FormatException {

	public static void main(String[] args) {
		String inputString = "abc";
		try {
			int a = Integer.parseInt(inputString);
		} catch (NumberFormatException ex) {
			System.err.println(" invalid input to parseInt(str)");

		}
	}
}