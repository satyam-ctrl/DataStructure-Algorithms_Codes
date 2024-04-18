package Lec1;
import java.util.*;
public class MaxOfThreeNums {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		
		if(a>b && a>c) {
			System.out.println("A is Greater");
		}
		else if(b>a && b>c) {
			System.out.println("B is Greater");
		}
		else {
			System.out.println("C is Greater");
		}
	}

}
