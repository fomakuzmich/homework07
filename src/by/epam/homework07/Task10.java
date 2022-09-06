package by.epam.homework07;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your string:");
		String s = scan.nextLine();
		
		System.out.println(changeABCtoWWWorPlusZZZ(s));
	}
	
	public static String changeABCtoWWWorPlusZZZ(String s) {
		if (s.startsWith("abc")) {
			s = s.replace("abc", "www");
		}
		else {
			s += "zzz";
		}
		return s;
	}

}
