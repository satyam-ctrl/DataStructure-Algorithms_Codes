package Lec4;

public class DigitSum {

	public static void main(String[] args) {
		int n = 123456;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
		System.out.println(sum);
	}
}
