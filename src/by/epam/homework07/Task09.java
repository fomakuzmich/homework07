package by.epam.homework07;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input first string:");
		String first = scan.nextLine();
		
		System.out.println("Input second string:");
		String second = scan.nextLine();
		
		printStringWithBiggerLength(first, second);
		
		
	}
	
	public static void printStringWithBiggerLength(String one, String two) {
		
		if (one.length() > two.length()) {
			for (int i = 0; i < one.length() - two.length(); i++) {
				System.out.println(one);
			}
		}
		else {
			for (int i = 0; i < two.length() - one.length(); i++) {
				System.out.println(two);
			}
		}
	}

}
