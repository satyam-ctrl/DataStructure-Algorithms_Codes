package Lec2;

public class SquarePattern {

	public static void main(String[] args) {
		int row = 1;
		int star = 5;
		int n=5;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("*");
				i++;
			}
			row++;
			System.out.println();
		}
	}
}
