package Lec3;

public class FourCornerTriangle {

	public static void main(String[] args) {
		int n=7;
		int star=3;
		int space=1;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			if(row<=(n/2)) {
				space+=2;
				star--;
			}
			else {
				space-=2;
				star++;
			}
			row++;
			System.out.println();
		}

	}

}
