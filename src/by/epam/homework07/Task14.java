package by.epam.homework07;

public class Task14 {

	public static void main(String[] args) {
		
		String s = "i say 1, you say 2, we say 3,4,5";
		
		System.out.println(countNumbersInString(s));
		
	}
	
	public static int countNumbersInString(String s) {
		
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
				
				if (s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' ||
						s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' ||
						s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' ||
						s.charAt(i) == '9') {
					count++;
					}
				}
		
		return count;
	}

}
