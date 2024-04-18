package Lec3;

public class LHSTrident {

	public static void main(String[] args) {
		int row=1;
		int n=5;
		int star=5;
		int space=0;
		while(row<=2*n-1) {
			int j=1;
			while(j<=space) {
				System.out.print("   ");
				j++;
			}
			int i=1;
			while(i<=star) {
				System.out.print("*  ");
				i++;
			}
			if(row<n) {
				space+=2;
				star--;
			}
			else {
				star++;
				space-=2;
			}
			row++;
			System.out.println();
		}
	}
}
