package Arrays;
import java.util.Scanner;

public class ArraryScanningforaNumber {
	
	public static int linearSearch(int[] arr, int x){
		int n=arr.length;
		for(int i=0; i<n; i++) {

			if(arr[i]==x)
				return i;
		}
		
		return -1;
	}
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static void printArray(int[] arr) {
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
     
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int[] arr = takeInput();
		int x = s.nextInt();
		int result = linearSearch(arr,x);    // from this line inputed value of x and arr taken in will be passed to function.
		System.out.print(result);	
	}
}
