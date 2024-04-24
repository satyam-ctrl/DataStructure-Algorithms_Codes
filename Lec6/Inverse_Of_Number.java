package Lec6;

public class Inverse_Of_Number {

	public static void main(String[] args) {
		int n=32145;
		int pos=1;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=(sum+pos*Math.pow(10, rem-1));
			pos++;
			n/=10;
		}
		System.out.println(sum);
	}
}
