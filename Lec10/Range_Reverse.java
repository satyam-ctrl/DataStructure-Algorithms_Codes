package Lec10;

import java.util.*;

public class Range_Reverse {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int k = 0; k < arr.length; k++) {
			arr[k] = kb.nextInt();
		}
		int a = kb.nextInt();
		int b = kb.nextInt();

		Reverse(arr, a, b);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}

	public static void Reverse(int arr[], int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
