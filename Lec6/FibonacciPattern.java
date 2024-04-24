package Lec6;

public class FibonacciPattern {

	public static void main(String[] args) {
		int n=4;
		int star=1;
		int row=1;
		int a=0;
		int b=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print(a+"\t");
				int c=a+b;
				a=b;
				b=c;
				i++;
			}
			row++;
			star++;
			System.out.println();
		}

	}

}
