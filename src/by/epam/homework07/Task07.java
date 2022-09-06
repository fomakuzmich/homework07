package by.epam.homework07;

public class Task07 {

	public static void main(String[] args) {
		
		String s = "+-+-0+=fd=-f=f-+)fregjeogieprofe=+-0=0-0-0-0v+-0";
		int countPlusMinus = 0;
		int countPlusMinusZero = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '+' || s.charAt(i) == '-') {
				countPlusMinus += 1;
				if (i < s.length() - 1 && s.charAt(i + 1) == '0') {
					 countPlusMinusZero += 1;
				 }
			 }
		 }
		System.out.println(countPlusMinus + " + and -");
		System.out.println(countPlusMinusZero + " +0 and -0");
		
	}

}
