package Lec3;

public class Print1inSolidHalfDiamond {
	public static void main(String[] args) {
		int n=5;
		int num=1;
		int row=1;
		int space=4;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=num) {
				System.out.print("1 ");
				j++;
			}
			space--;
			num+=2;
			row++;
			System.out.println();
		}
	}
}
