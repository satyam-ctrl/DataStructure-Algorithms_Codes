package Lec2;

public class SemiHollowSquareWithHollowRombus {

	public static void main(String[] args) {
		int star=1;
		int n=5;
		int space=2*n-3;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			if(row==n) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			star++;
			space-=2;
			row++;
			System.out.println();
		}
	}
}
