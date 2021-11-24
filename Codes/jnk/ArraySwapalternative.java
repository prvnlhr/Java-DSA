package jnk;
import java.util.Scanner;

public class ArraySwapalternative {


	public static void swapAlternate(int arr[]) {

		for(int i=0; i<arr.length-1; i=i+2){
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput(){

		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {

		int[] input = takeInput();
		swapAlternate(input);
		for(int i = 0; i < input.length; i++){
			System.out.print(input[i] +" ");
		}
	}
}




