package Arrays;
import java.util.Scanner;

public class ArraySum {

	// function to sum of array elements
	public static int[] summation(int[] arr1, int[] arr2){

		int size=Math.max(arr1.length,arr2.length);
		int[] sum = new int[size+1];

		int carry=0;
		int l1=arr1.length-1;
		int l2=arr2.length-1;
		int l3=sum.length-1;

		while(l3>0){
			if(l1>=0 && l2>=0) {
				sum[l3]=arr1[l1]+arr2[l2]+carry;

				if(sum[l3]>9) {
					sum[l3]=sum[l3]%10;
					carry=1;
				}
				else {
					carry=0;
				}
				l3--;
				l1--;
				l2--;
			}

			else if(l1<0 && l2>=0) {
				sum[l3]= carry+arr2[l2];

				if(sum[l3]>9) {
					carry=1;
					sum[l3]=sum[l3]%10;
				}
				else {
					carry=0;
				}
				l2--;
				l3--;
			}
			else if(l2<0 && l1>=0) {
				sum[l3]=carry+arr1[l1];
				if(sum[l3]>9) {
					carry=1;
					sum[l3]=sum[l3]%10;
				}
				else {
					carry=0;
				}
				l1--;
				l3--;
			}
			else {
				sum[l3]=carry;
				l3--;
			}
		}
		return sum;
	}


	//printing array
	public static void printArray(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	// take input of array
	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	// main program starting
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		int [] arr3=summation(arr1, arr2);
		printArray(arr3);
	}
}

