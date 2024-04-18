package Lec2;

public class SolidTopPyramid {

	public static void main(String[] args) {
		int space=4;
		int star=1;
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
			row++;
			star+=2;
			space--;
			System.out.println();
		}
	}
}
