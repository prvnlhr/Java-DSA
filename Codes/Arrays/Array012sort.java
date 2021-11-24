package Arrays;
import java.util.Scanner;

public class Array012sort {
	
	public static int[] sorting(int[] arr){
		
	
		int n1 = 0,n2 = 0,n3 = 0,i,j;
		for(i = 0;i < arr.length;i++) {
			if(arr[i] == 0)
				n1++;
			if(arr[i] == 1)
				n2++;
			if(arr[i] == 2)
				n3++;	
		}   
		    i = 0;
		    j = 0;
			while(j < n1) {
				arr[i] = 0;
				i++;
				j++;
			}
			j = 0;
			while(j < n2) {
				arr[i] = 1;
				i++;
				j++;
			}
			j = 0;
			while(j < n3) {
			    arr[i] = 2;
			    i++;
			    j++;
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
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
	
		int[] arr = takeInput();

		int [] arr1=sorting(arr);
		
		printArray(arr);
	
	}
}


