package Lec9;

public class MaxArray {

	public static void main(String[] args) {
		int arr[] = { 100, 50, 20, 4, 69, 40, 58, 12 };
		System.out.println(Max_Array(arr));
	}
	public static int Max_Array(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
