package Lec2;

public class HalfArraowRHS {
	public static void main(String[] args) {
		int space=8;
		int star=1;
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
			space-=2;
			star++;
			row++;
			System.out.println();
		}
				
	}

}
