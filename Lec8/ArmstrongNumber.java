package Lec8;
import java.util.*;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(isArmStrongNumber(n));
	}
	public static int CountDigit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		return count;
	}

	public static boolean isArmStrongNumber(int n) {
		int d = CountDigit(n);
		int sum = 0;
		int p=n;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, d));
			n /= 10;
		}
		if (sum == p) {
			return true;
		} else {
			return false;
		}
	}
}
