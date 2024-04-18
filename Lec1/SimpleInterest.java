package Lec1;
import java.util.*;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int p = kb.nextInt();
		int t = kb.nextInt();
		int r = kb.nextInt();
		int si = (p*t*r)/100;
		System.out.println(si);
	}

}
