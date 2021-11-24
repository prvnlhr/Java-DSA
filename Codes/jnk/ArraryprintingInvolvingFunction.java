package jnk;
import java.util.Scanner;
public class ArraryprintingInvolvingFunction {

	public static void printArray(int []arr) {

		int n=	arr.length;

		System.out.println("Required Array is:");

		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] inputarray() {

		System.out.println("Input the Array Length:");

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int [n];

		for(int i=0; i<n;i++) {

			System.out.println("Enter the "+i +"th index:");
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {

		int arr[]=inputarray();
		printArray(arr);
	}
}
