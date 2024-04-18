package Lec3;

public class PrintRowNumofDiamond {
	public static void main(String[] args) {
		int row=1;
		int n=5;
		int num=1;
		int space=4;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=num) {
				System.out.print(row+" ");
				j++;
			}
			row++;
			space--;
			num+=2; 
			System.out.println();
		}
	}
}
