package Lec2;

public class SolidBottomPyramid {

	public static void main(String[] args) {
		int space=0;
		int star=9;
		int n=5;
		int row=1;
		while(row<=n) {
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
			star-=2;
			space++;
			row++;
			System.out.println();
		}
	}
}
