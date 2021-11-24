package jnk;
import java.util.Scanner;

public class ArrayPratice2 {

	public static int[] change(int[] arr) {

		for(int j=0; j<arr.length; j++) {

			if( arr[j]/4!=0 ) {
				int rem=arr[j]/4;
				arr[j]=rem;
			}
			else if(arr[j]/4==0) {
				arr[j]=-1;
			}
		}
		return arr;
	}

	public static void printarray(int[] arr) {

		int n=arr.length;
		for(int i=0; i<n;i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] takeinput() {

		Scanner s=new Scanner(System.in);
        int n=s.nextInt();

		int[] arr=new int[n];

		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {

		int [] arr=takeinput();

		int[] arr1=change(arr);

		printarray(arr);
	}
}
