package Recursion;

import java.util.Scanner;

public class ArraySumRecursion {

	static int result = 0;

	public static int sum(int[] input) {

		int n = input.length - 1;

		if (n >= 0) {
			result = result + input[n];

			int[] smallarray = new int[input.length - 1];

			for (int i = 0; i < smallarray.length; i++) {
				smallarray[i] = input[i];
			}
			sum(smallarray);
			return result;
		} else {
			return result;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] input = new int[size];
		for (int i = 0; i < input.length; i++) {
			input[i] = s.nextInt();
		}
		int result = sum(input);
		System.out.println(result);

	}

}
