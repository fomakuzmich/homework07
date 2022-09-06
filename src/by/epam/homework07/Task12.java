package by.epam.homework07;

import java.util.Arrays;
import java.util.Random;

public class Task12 {

	public static void main(String[] args) {
		
		String s = "zxcvbnm,.sdfhjjklgweuiio";
		trimForThreeChars(s);
		
		String[] parts = trimForThreeChars(s);
		printArray(parts);
		
		for (int i = 0; i < parts.length; i++) {
			parts[i] = changeMiddleElement(parts[i]);
		}
		printArray(parts);
		
		Arrays.sort(parts);
		
		printArray(parts);
		
	}
	
	public static String[] trimForThreeChars(String s) {
		int x = s.length()/3;
		if (s.length()%3 > 0) {
			x++;
		}
		String[] parts = new String[x];
		int j = 0;
		for (int i = 0; j < s.length() - 3 && i < parts.length - 1; i++, j += 3) {
			parts[i] = s.substring(j, j + 3);
		}
		parts[parts.length - 1] = s.substring(j, s.length());
				
		return parts;
	}
	
	public static void printArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static String changeMiddleElement(String s) {
		Random random = new Random();
		char c;
		String cs = "";
		do {
			c = (char)(random.nextInt(25) + 97);
			cs = "" + c;
		} while (s.contains(cs));
		s = s.replace(s.charAt(1), c);
		return s;
	}

}
