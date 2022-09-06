package by.epam.homework07;

public class Task13 {

	public static void main(String[] args) {
		
		String s = "I am a gun on the run";
		
		s = changeChars(s);
		
		System.out.println(s);
		
	}
	
	public static String changeChars(String s) {
		
		StringBuilder strngBldr = new StringBuilder(s);
		
		for (int i = 0; i < s.length(); i += 2) {
			if (s.charAt(i) != 'a' && s.charAt(i) != 'b') {
				strngBldr.setCharAt(i, 'a');
			}
			else {
				strngBldr.setCharAt(i, 'c');
			}
		}
		s = strngBldr.toString();
		
		return s;
	}

}
