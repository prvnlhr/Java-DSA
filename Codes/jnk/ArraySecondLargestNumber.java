package jnk;
import java.util.Scanner;

public class ArraySecondLargestNumber {
	public static int SecondLargest(int arr[]) {

		int largest=arr[0];
		int secondlargest=0;

		int i;
		for(i=0; i<arr.length; i++) {

			if(arr[i]>largest){
				secondlargest=largest;
				largest=arr[i];
			}
			else if(arr[i]<largest && arr[i]>secondlargest) {
				secondlargest=arr[i];
			}
			else if(arr[i]==largest) {
				continue;
			}
		}
		return secondlargest;
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
		SecondLargest(arr);
		System.out.println(SecondLargest(arr));
	}
}





