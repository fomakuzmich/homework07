package by.epam.homework07;

public class Task05 {

	public static void main(String[] args) {
		
		String s = "All animals are equal, but some animals are equal then other";
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == s.charAt(s.length() - 1)) {
				
				System.out.println(i);
			}
		}
	}

}
