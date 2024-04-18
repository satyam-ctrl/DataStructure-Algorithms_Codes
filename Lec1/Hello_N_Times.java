package Lec1;
import java.util.*;
public class Hello_N_Times {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();		
		int i =1;
		while(i<=n) {
			System.out.println("Hello");
			i++;
		}
	}
}
