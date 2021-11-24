package Arrays;
import java.util.Scanner;

public class ArrayMergeTwoArrays {

	public static int[] merging(int[] arr1, int[] arr2){
		int i = 0,j = 0,k = 0;
		int[] arr3 = new int[arr1.length + arr2.length];

		while(i < arr1.length && j < arr2.length ){
			if(arr1[i] <= arr2[j]){
				arr3[k++] = arr1[i++];
			}
			else {
				arr3[k++] = arr2[j++];
			}
		}

		for(;i < arr1.length;){     //this loop are to put all the remaining elements 
			arr3[k++] = arr1[i++];    //after comparison from above loop
		}
		for(;j < arr2.length;){
			arr3[k++] = arr2[j++];
		}
		return arr3;
	}


	public static void printArray(int[] arr){
		for (int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	static Scanner s = new Scanner(System.in);

	public static int[] takeInput(){
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++){
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args){
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		int [] arr3=merging(arr1, arr2);
		printArray(arr3);

	}
}


