package Lec3;

public class HollowDiamond {

	public static void main(String[] args) {
		int n=7;
		int star=1;
		int sp1=3;
		int sp2=-1;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=sp1) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			int k=1;
			while(k<=sp2) {
				System.out.print("  ");
				k++;
			}
			int l=1;
			if(row==1 || row==n) {
				l=2;
			}
			while(l<=star) {
				System.out.print("* ");
				l++;
			}
			if(row<=(n/2)) {
				sp1--;
				sp2+=2;
			}
			else {
				sp1++;
				sp2-=2;
			}
			row++;
			System.out.println();
		}
	}
}
