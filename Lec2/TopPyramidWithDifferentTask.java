package Lec2;

public class TopPyramidWithDifferentTask {
	public static void main(String[] args) {
		int row=1;
		int star=1;
		int space=4;
		int n=5;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				if(j%2!=0) {
					System.out.print("* ");
					j++;
				}
				else {
					System.out.print("! ");
					j++;
				}	
			}
			space--;
			star+=2;
			row++;
			System.out.println();
		}
	}
}
