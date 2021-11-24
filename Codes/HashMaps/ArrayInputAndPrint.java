package HashMaps;

import java.util.Scanner;

public class ArrayInputAndPrint {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int[n];

		for(int i = 0 ; i<arr.length ;i++) {
			arr[i]= s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int [] arr) {
		for(int i = 0 ; i< arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
