package Lec3;

public class SolidSquareWithHollowRombus {
	public static void main(String[] args) {
		int star=4;
		int row=1;
		int space=-1;
		int n=7;
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
			if(row==1 || row==n) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			if(row<=(n/2)) {
				space+=2;
				star--;
			}
			else {
				space-=2;
				star++;
			}
			row++;
			System.out.println();
		}
	}
}
