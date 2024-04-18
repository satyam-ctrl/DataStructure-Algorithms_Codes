package Lec3;

public class MirrorLHSTriangle {

	public static void main(String[] args) {
		int star=1;
		int row=1;
		int n=5;
		int space=n-1;
		while(row<=2*n-1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			if(row<n) {
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
			row++;
			System.out.println();
		}
	}
}
