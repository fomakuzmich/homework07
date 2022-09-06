package by.epam.homework07;

public class Task17 {

	public static void main(String[] args) {
		
		String s = "xabcxabcxab";
		System.out.println(removeXforwardABC(s));
		
	}
	
	public static String removeXforwardABC(String s) {
		
		return s.replace("xabc", "abc");
	}

}
