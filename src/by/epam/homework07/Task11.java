package by.epam.homework07;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input your string:");
		String s = scan.nextLine();
		
		if (s.length() > 10) {
			s = cutForSix(s);
		}
		else {
			s = plusO(s);
		}
		System.out.println(s);
	}
	
	public static String plusO(String s) {
		
		for (int i = s.length(); i < 12; i++) {
			s += "o";
		}
		return s;
	}
	
	public static String cutForSix(String s) {
		
		s = s.substring(0, 6);
		return s;
	}

}
