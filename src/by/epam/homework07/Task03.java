package by.epam.homework07;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input your string:");
		String s = scan.nextLine();
		
		if (s.length() > 5) {
			
			System.out.println(s.substring(0, 3));
			System.out.println(s.substring(s.length() - 3));
		}
		else {
			
			for (int i = 0; i < s.length(); i++) {
				
				System.out.println(s.charAt(0));
			}
		}
	}
}
