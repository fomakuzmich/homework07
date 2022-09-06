package by.epam.homework07;

public class Task15 {

	public static void main(String[] args) {
		
		String s = "teachers leave them kids alone";
		
		System.out.println(containsOnlyABC(s));
		
		
	}
	
	public static boolean containsOnlyABC(String s) {
		boolean answer = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'b' || s.charAt(i) == 'c') {
				answer = true;
			}
			else {
				return false;
			}
		}
		return answer;
	}

}
