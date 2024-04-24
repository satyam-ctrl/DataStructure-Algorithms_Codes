package Lec6;

import java.util.*;

public class Conversion_Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int min = kb.nextInt();
		int max = kb.nextInt();
		int steps = kb.nextInt();

		for (int i = min; i <= max; i = i + steps) {
			int c = (int) (((5.0) / 9) * (i - 32));
			System.out.println(i + "\t" + c);
		}
	}
}
