package Lec3;
public class HollowSquare {
	public static void main(String[] args) {
		int n=5;
		int star=5;
		int space=3;
		int row=1;
		while(row<=n) {
			int i=1;
			if(row==1 || row==n) {
				while(i<=star) {
					System.out.print("* ");
					i++;
				}
			}
			else {
				int j=4;
				while(j<star) {
					System.out.print("* ");
					j++;
				}
				int k=1;
				while(k<=space) {
					System.out.print("  ");
					k++;
				}
				int l=4;
				while(l<star) {
					System.out.print("* ");
					l++;
				}
			}
			row++;
			System.out.println();
		}
	}
}
