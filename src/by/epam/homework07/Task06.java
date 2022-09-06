package by.epam.homework07;

public class Task06 {

	public static void main(String[] args) {
		
		String s = "dead bodies everywhere";
		
		for (int i = 2; i < s.length(); i +=3) {
			System.out.println(s.charAt(i));
		}
	}

}
