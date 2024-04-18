package Lec2;

public class RightAngleTriangle {

	public static void main(String[] args) {
		int row=1;
		int n=5;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			row++;
			star++;
			System.out.println();
		}

	}

}
