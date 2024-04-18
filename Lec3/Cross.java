package Lec3;

public class Cross {

	public static void main(String[] args) {
		int n=5;
		int sp1=0;
		int star=1;
		int sp2=3;
		int row=1;
		while(row<=n) {
			int l=1;
			while(l<=sp1) {
				System.out.print("  ");
				l++;
			}
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int k=1;
			while(k<=sp2) {
				System.out.print("  ");
				k++;
			}
			int m=1;
			if(row==3) {
				m=2;
			}
			while(m<=star) {
				System.out.print("* ");
				m++;
			}
			if(row<=(n/2)) {
				sp1++;
				sp2-=2;
			}
			else {
				sp1--;
				sp2+=2;
			}
			row++;
			System.out.println();
		}
	}
}
