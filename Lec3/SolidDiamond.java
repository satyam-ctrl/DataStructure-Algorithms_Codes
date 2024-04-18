package Lec3;

public class SolidDiamond {

	public static void main(String[] args) {
		int n=7;
		int star=1;
		int space=3;
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
			if(row<=(n/2)) {
				space--;
				star+=2;
			}
			else {
				space++;
				star-=2;
			}
			row++;
			System.out.println();
		}
	}
}
