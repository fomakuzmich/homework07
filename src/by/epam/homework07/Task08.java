package by.epam.homework07;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your string");
		
		String s = scan.nextLine();
		
		String x = "x";
		String w = "w";
		
		whoFirstTimeMeets(s, x, w);
	}
	
	public static void whoFirstTimeMeets(String s, String one, String two) {
		int oneNum = s.length();
		int twoNum = s.length();
		
		if (s.contains(one) && s.contains(two)) {
			
			for (int i = s.length() - 1; i >= 0; i--) {
				
				if (s.charAt(i) == one.charAt(0)) {
					
					oneNum = i;
				}
				if (s.charAt(i) == two.charAt(0)) {
					
					twoNum = i;
				}
			}
			if (oneNum < twoNum) {
				
				System.out.println("\"" + one + "\" meets before than \"" + two + "\"");
			}
			else {
				
				System.out.println("\"" + two + "\" meets before than \"" + one + "\"");
			}
		}
		else if (s.contains(one)) {
			
			for (int i = s.length() - 1; i >= 0; i--) {
				
				if (s.charAt(i) == one.charAt(0)) {
					
					oneNum = i;
				}
			}
			System.out.println("\"" + one + "\" meets on " + oneNum + " position");
			System.out.println("Entered string is not contains \"" + two + "\"");
		}
		else if (s.contains(two)) {
			
			for (int i = s.length() - 1; i >= 0; i--) {
				
				if (s.charAt(i) == two.charAt(0)) {
					
					twoNum = i;
				}
			}
			System.out.println("\"" + two + "\" meets on " + twoNum + " position");
			System.out.println("Entered string is not contains \"" + one + "\"");
		}
		else {
			System.out.println("Entered string is not contains \"" + one + "\" and \"" + two + "\"");
		}
	}
}
