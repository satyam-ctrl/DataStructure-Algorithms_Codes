package Lec2;

public class RightAngleTriangle3 {

	public static void main(String[] args) {
		int row=1;
		int star=5;
		int space=0;
		int n=5;
		while(row<=n) {
			int i=0;
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
			star--;
			space++;
			System.out.println();
		}

	}

}
