package by.epam.homework07;

public class Task16 {

	public static void main(String[] args) {
		
		String s = "This is my word for you";
		s = changeWordToLetter(s);
		System.out.println(s);
		
	}
	
	public static String changeWordToLetter(String s) {
		
		String word = "word";
		String letter = "letter";
		s = s.replace(word, letter);
		
		return s;
	}

}
