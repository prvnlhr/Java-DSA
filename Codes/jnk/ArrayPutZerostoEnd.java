package jnk;
import java.util.Scanner;
public class ArrayPutZerostoEnd {

	public static int[] zerotoend(int[] arr){
		int nonzeropos=0;

		for(int i=0; i<arr.length; i++){

			if(arr[i]!=0){
				int temp=arr[i];
				arr[i]=arr[nonzeropos];
				arr[nonzeropos]=temp;
				nonzeropos++;
			}
		}
		return arr;
	}

	public static void printArray(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {

		int size = s.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < size; i++){
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] arr = takeInput();
		zerotoend(arr);
		printArray(arr);
	}
}





