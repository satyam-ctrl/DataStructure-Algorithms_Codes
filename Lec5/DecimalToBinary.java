package Lec5;

public class DecimalToBinary {

	public static void main(String[] args) {
		int n=77; // Decimal Number is given so it is a Source Base
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem=n%2; //We have to Convert to Binary so it is a Destination Base.
			sum+=rem*mul;
			mul*=10;
			n/=2;
		}
		System.out.println(sum);
	}
}
