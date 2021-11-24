package jnk;
import java.util.Scanner;

public class Array0and1 {

	public static void pairSum(int[] arr, int x){

		int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
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

		int[] arr = takeInput();
		int x = s.nextInt();
		pairSum(arr, x);
	}
}


