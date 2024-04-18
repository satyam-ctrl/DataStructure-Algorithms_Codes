package Lec2;

public class SpacedRightAngleTriangle {

	public static void main(String[] args) {
		int star=5;
		int space=0;
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
			space+=2;
			star--;
			System.out.println();
		}
	}
}
