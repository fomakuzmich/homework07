package by.epam.homework07;

public class Task02 {

	public static void main(String[] args) {
		
		String s = "This is my homework";
		
		printFirstCharOfString(s);
		printLastCharOfString(s);
		printMidCharOfString(s);
		
		
	}
	
	public static void printFirstCharOfString(String s) {
		
		System.out.println(s.charAt(0));
	}
	
	public static void printLastCharOfString(String s) {
		
		System.out.println(s.charAt(s.length() - 1));
	}
	
	public static void printMidCharOfString(String s) {
		
		if (s.length() % 2 != 0) {
			
			System.out.println(s.charAt(s.length() / 2));
		}
		else {
			
			System.out.println("There is no middle char in the string");
		}
	}

}
