package by.epam.homework07;

import java.util.Scanner;

public class Task45 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input your name, surname and year of birth:");
		String name = scan.next();
		String surname = scan.next();
		String year = scan.next();
		
		generateEmail(name, surname, year);
		
	}
	
	public static void generateEmail(String a, String b, String c) {
		
		System.out.println(a + b + c + "@poshta.by");
		System.out.println(b + a + c + "@poshta.by");
		System.out.println(a + "_" + b + c + "@poshta.by");
		System.out.println(b + "_" + a + c + "@poshta.by");
		
		if (c.length() == 4) {
			System.out.println(a + b + c.charAt(2) + c.charAt(3) + "@poshta.by");
			System.out.println(b + a + c.charAt(2) + c.charAt(3) + "@poshta.by");
			System.out.println(a + "_" + b + c.charAt(2) + c.charAt(3) + "@poshta.by");
			System.out.println(b + "_" + a + c.charAt(2) + c.charAt(3) + "@poshta.by");
			
		}
	}

}
