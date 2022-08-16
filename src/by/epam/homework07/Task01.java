package by.epam.homework07;

public class Task01 {

	public static void main(String[] args) {
		
		String s = "JAVA";
		
		printString3Times(s);
		
		System.out.println("String length: " + s.length());
	}
	
	public static void printString3Times(String s) {
		
		for (int i = 0; i < 3; i++) {
			System.out.print(s);
			if (i < 2) {
				System.out.print(", ");
			}
			else {
				System.out.println();
			}
		}
	}

}
