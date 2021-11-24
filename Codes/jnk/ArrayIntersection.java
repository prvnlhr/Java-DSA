package jnk;
import java.util.Arrays;
//import java.util.HashSet;
import java.util.Scanner;



public class ArrayIntersection{

	public static void intersections(int[] arr1, int[] arr2){
		
		
	
		Arrays.sort(arr2);
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		for(int i=0;i<arr1.length;i++){

			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.println(arr1[i]);
					arr2[j]=Integer.MIN_VALUE;   //this is garbage value concept we are using to 
//	                break;                     // avoid the printing of repeating element again in array..
				}                               // basically after printing the intersection 
                                                //value we are making it equal to the garbage value 
			}                                   // which can be equal to 1 or -1 or MIN VALUE.

		}
	}


	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		intersections(arr1, arr2);
	}
}


