package by.epam.homework07;

public class Task19 {

	public static void main(String[] args) {
		
		String s = "jabadabadum";
		
		countABAinString(s);
		
	}
	
	public static void countABAinString(String s) {
		int count = 0;
		for (int i = 0; i < s.length() - 2; i++) {
			if (s.charAt(i) == 'a' && s.charAt(i + 1) == 'b' && s.charAt(i + 2) == 'a') {
				count++;
			}
		}
		System.out.println(count);
	}

}
