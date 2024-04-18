package Lec3;

public class NumberHalfDiamondPattern {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int num=1;
		int space=4;
		int val=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<=num) {
				System.out.print(row+" ");
				if(j<=row/2) {
					num++;
				}
				else {
					num--;
				}
				j++;
			}
			space--;
			
			System.out.println();
		}

	}

}
