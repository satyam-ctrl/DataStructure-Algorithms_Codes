package Lec3;

public class numberDiamondVerticalMirrors {

	public static void main(String[] args) {
		int n=5;
		int num=1;
		int space=4;
		int row=1;
		int val=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			int p=val;
			while(j<=num) {
				System.out.print(p+" ");
				if(j<=num/2) {
					p++;
				}else {
					p--;
				}
				j++;
			}
			row++;
			space--;
			num+=2;
			val++;
			System.out.println();
		}
	}
}
