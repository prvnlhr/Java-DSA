package jnk;
import java.util.Scanner;

public class ArrayToFindtheRotatingIndex {
	public static int rotatingIndex(int arr[]) {
		int index=0;

		for(int i=0; i<arr.length-1; i++){

			if(arr[i+1]<arr[i]) {
				index=i+1;
			}
		}
		return index;
	}
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput(){

		int size = s.nextInt();
		int[] arr = new int[size];

		for(int i = 0; i < size; i++){
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] arr = takeInput();
		rotatingIndex(arr);
		System.out.println(rotatingIndex(arr));
	}
}



