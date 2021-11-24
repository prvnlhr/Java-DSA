package jnk;
import java.util.Scanner;

public class ArrayRotationtoLeft {

	public static void rotateLeft(int[] arr,int d){

		int[] arr1 = new int[arr.length];      //this program trick is basically to create a new array arr1,
		int i;                                 //then we have to move all the elements from arr to arr1;

		for(i= 0;i < arr.length;i++) {         // after that we have to place i+d to n at i=0 to n=arrlength elements from arr1 to arr,
			arr1[i] = arr[i];                   //then after the remaining elements from arr1 are moved to arr and finally printed.
		}
		for(i = 0;i < arr.length - d;i++) {
			arr[i] = arr1[i+d];
		}
		for(int j = i;j < arr.length;j++) {
			arr[j] = arr1[d - arr.length + j];
		}
	}

	public static void printArray(int[] arr1) {
		for (int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}
	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {

		int n = s.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++){
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] arr = takeInput();
		int d=s.nextInt();
		rotateLeft(arr,d);
		printArray(arr);

	}
}


