package jnk;
import java.util.Scanner;

public class SumofArrayElements {

	public static int sum(int[] input){
		int sum=0;
		int size=input.length;
		for(int i=0; i<size;i++) {

			sum=sum+input[i];
		}
		return sum;
	}


	static Scanner s = new Scanner(System.in);
	public static int[] takeInput(){
		int size = s.nextInt();
		int input[] = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}


	public static void main(String[] args) {

		int input[] = takeInput();
		System.out.println(sum(input));

	}
}









