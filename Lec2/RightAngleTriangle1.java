package Lec2;

public class RightAngleTriangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int row=1;
			int n=5;
			int star=5;
			while(row<=n) {
				int i=1;
				while(i<=star) {
					System.out.print("* ");
					i++;
				}
				row++;
				star--;
				System.out.println();
			}
	}

}
