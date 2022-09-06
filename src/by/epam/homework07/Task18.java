package by.epam.homework07;

public class Task18 {

	public static void main(String[] args) {
		
		String s = "abc0123abc45abc";
		System.out.println(removeABCforwardNumbers(s));
	}

	public static String removeABCforwardNumbers(String s) {
		
		String abc = "abc";
		String number = "";
		
		for (int i = 0; i < 10; i++) {
			String numberI = number + i;
			String abcI = abc + i;
			s = s.replace(abcI, numberI);
		}
		
		return s;
	}

}
