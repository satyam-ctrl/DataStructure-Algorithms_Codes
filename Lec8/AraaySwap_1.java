package Lec8;

public class AraaySwap_1 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		System.out.print(arr[0] + " " + arr[1]);
		swap(arr, 0, 1);
		System.out.println();
		System.out.print(arr[0] + " " + arr[1]);
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
