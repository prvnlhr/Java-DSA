package Arrays;
import java.util.Scanner;

public class ArrayBinarySearchMethod {

	public static int binarysearch(int[] arr, int num){

		int start=0;
		int end =arr.length-1;


		while(start<=end){

			int mid=(start+end)/2;

			if(num==arr[mid]) 
				return mid;
			else if(num >arr[mid]) 		   
				start=mid+1;
			else 
				end=mid-1;
		}
		return -1;
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

		int num=s.nextInt();
		binarysearch(arr,num);
		System.out.println(binarysearch(arr,num));

	}
}



