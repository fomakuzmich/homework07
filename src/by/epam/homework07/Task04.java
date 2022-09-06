package by.epam.homework07;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Integer x = random.nextInt(8);
		if (x%2 != 0) {
			x += 1;
		}
		String s = x.toString();
		for (int i = 1; i < 10; i++) {
			if (i%2 == 0) {
				Integer r = random.nextInt(8);
				if (r%2 != 0) {
					r += 1;
				}
				s += r;
			}
			else {
				char c = (char)(random.nextInt(25)+65);
				s += c;
			}
		}
		System.out.println(s);
	}

}
