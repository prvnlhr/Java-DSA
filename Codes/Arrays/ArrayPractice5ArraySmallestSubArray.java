package Arrays;
import java.util.Scanner;

public class ArrayPractice5ArraySmallestSubArray{

	public static void smallestsubArray(int[] arr, int x){

		for(int i=0; i<arr.length; i++){

			for(int j=1; j<arr.length; j++){

				int sum	=arr[i]+arr[j];

				if(sum>x && i!=j) {
					int max=sum;
					System.out.println(arr[i]+" "+ arr[j]);
					return;
				}
			}
		}
	}

	public static void printarray(int[] arr) {

		int n=arr.length;
		for(int i=0; i<n;i++) {
			System.out.println(arr[i]);
		}
	}

	static Scanner s=new Scanner(System.in);

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

		int x=s.nextInt();

		smallestsubArray(arr, x);
	}
}



