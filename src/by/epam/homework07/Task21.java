package by.epam.homework07;

public class Task21 {

	public static void main(String[] args) {
		
		String s = "Now0is0the0time0for0me0to0rise0to0my0feet";
		String sequence = "0";
		printWordsWithoutSequance(s, sequence);
		
	}
	
	public static void printWordsWithoutSequance(String s, String sq) {
		String[] parts;
		parts = s.split(sq);
		
		for (String x : parts) {
			System.out.println(x);
		}
		
	}

}
