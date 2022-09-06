package by.epam.homework07;

public class Task20 {

	public static void main(String[] args) {
		
		String s = "      I   love    spaces     ";
		
		System.out.println(cutSpaces(s));
		
	}
	public static String cutSpaces(String s) {
		
		s = s.trim();
		while (s.contains("  ")) {
		s = s.replace("  ", " ");
		}
		return s;
	}

}
