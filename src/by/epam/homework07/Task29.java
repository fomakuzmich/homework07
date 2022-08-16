package by.epam.homework07;

import java.util.Scanner;

public class Task29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input your string:");
		String s = scan.nextLine();
		s = s.replace('o', 'O');
		s = s.replace('a', 'A');
		System.out.println(s);
		
	}
}
