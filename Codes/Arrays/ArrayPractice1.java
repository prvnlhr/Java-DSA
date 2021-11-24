package Arrays;
import java.util.Scanner;

public class ArrayPractice1 {

	public static int sum(int [] arr){

		int sum=0;
		for(int i=0; i<arr.length; i++){

			if(arr[i]%2==0 || arr[i]%3==0){
				sum=sum+arr[i];
			}
		}
		return sum;
	}


	public static void printarray(int[]arr){
		int n=arr.length;
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}



	public static int[] input() {

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		int[] arr=new int[n];

		for(int i=0; i<n; i++){
			arr[i]=s.nextInt();		
		}
		return arr;
	}


	public static void main(String[] args) {

		int[] arr=input();

		int sum=sum(arr);

		System.out.println(sum);
	}
}
