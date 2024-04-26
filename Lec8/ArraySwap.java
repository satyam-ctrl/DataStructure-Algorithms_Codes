package Lec8;

public class ArraySwap {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.print(arr[0] + " " + arr[1]);
		swap(arr[0] , arr[1]);
		System.out.println();
		System.out.print(arr[0] + " " + arr[1]);
	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}
