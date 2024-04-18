package Lec3;

public class PrintHalfDiamondNumbers {

	public static void main(String[] args) {
		int n=5;
		int num=1;
		int space=4;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			int j=1;
			int val=1;
			while(j<=num) {
				System.out.print(val+"\t");
				j++;
				val++;
			}
			space--;
			row++;
			num+=2;
			System.out.println();
		}
	}

}
