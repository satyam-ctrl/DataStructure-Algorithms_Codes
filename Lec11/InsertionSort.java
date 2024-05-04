package Lec11;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 10, 50, -3, 27, 5, 63 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int picked = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > picked) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = picked;
		}
	}
}
