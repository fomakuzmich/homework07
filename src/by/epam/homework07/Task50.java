package by.epam.homework07;

public class Task50 {

	public static void main(String[] args) {
		
		String s = "RUMAMBAHARUMAMBURUM";
		
		System.out.println(separateBySpaces(s));	
		
		
	}
	
	public static String separateBySpaces(String s) {
		String newS = s.substring(0, 1);
		for (int i = 1; i < s.length(); i++) {
			newS += " " + s.charAt(i);
		}
		return newS;
	}

}
