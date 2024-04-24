package Lec6;

public class P1 {

	public static void main(String[] args) {
		int n=5;
		int star=5;
		int space=4;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			if(row==1 || row==n) {
				while(j<=star) {
					System.out.print("* ");
					j++;
				}
			}else {
				System.out.print("* ");
				int k=1;
				while(k<=n-2) {
					System.out.print("  ");
					k++;
				}
				System.out.print("* ");
			}
			space--;
			row++;
			System.out.println();
		}

	}

}
