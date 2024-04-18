package Lec1;
import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int age = kb.nextInt();
		if(age>=18) {
			System.out.println("Eligible to Vote");
		} else {
			System.out.println("Not Eligible");
		}
	}

}
