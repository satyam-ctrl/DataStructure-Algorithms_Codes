package Lec3;

public class PrintHalfDiamond1To25 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int space=4;
		int num=1;
		int val=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			int j=1;
			while(j<=num) {
				System.out.print(val+"\t");
				val++;
				j++;
			}
			num+=2;
			space--;
			row++;
			System.out.println();
		}

	}

}
