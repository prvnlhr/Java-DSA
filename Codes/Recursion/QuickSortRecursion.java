package Recursion;

import java.util.Scanner;

public class QuickSortRecursion {

	public static void quickSort(int[] input) {

		quickSort(input, 0, input.length - 1);
		int startIndex = 0;
		int endIndex = input.length - 1;
		int p = partition(input, startIndex, endIndex);
	}

	public static int partition(int[] input, int si, int ei) {
		int count = 0;
		int pivot = input[si];
		for (int i = si + 1; i <= ei; i++) {
			if (input[i] <= pivot) {
				count++;
			}
		}

		int pivotIndex = si + count;
		input[si] = input[pivotIndex];
		input[pivotIndex] = pivot;

		int i = si;
		int j = ei;

		while (i < j) {
			while (i <= ei && input[i] <= pivot) {
				i++;
			}
			while (input[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				i++;
				j--;
			}
		}
		return pivotIndex;
	}

	public static void quickSort(int[] input, int startIndex, int endIndex) {
		if (startIndex >= endIndex) {
			return;
		}
		int partitonIndex = partition(input, startIndex, endIndex);
		quickSort(input, startIndex, partitonIndex - 1);
		quickSort(input, partitonIndex + 1, endIndex);
	}

	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {

		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		quickSort(input);
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
}
