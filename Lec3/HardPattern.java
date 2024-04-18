package Lec3;

public class HardPattern {

	public static void main(String[] args) {
		int n=3;
		int num=1;
		int space=3;
		int row=1;
		int val=1;
		while(row<=2*n-1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			int p = val;
			while(j<=num) {
				System.out.print(p+" ");
				if(j<=num/2) {
					p++;
				}else {
					p--;
				}
				j++;
			}
			if(row<n) {        //n=3
				num+=2;
				space--;
				val++;
			}else {
				num-=2;
				space++;
				val--;
			}
			row++;
			System.out.println();
		}
	}
}
