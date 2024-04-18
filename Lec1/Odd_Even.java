package Lec1;
import java.util.*;
public class Odd_Even {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		if(num%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("ODD");
		}
	}
}
