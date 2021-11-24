package Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

	public static int sum(int[] arr){

		int sum=0;

		for(int i=0; i<arr.length; i++){
			sum=sum+arr[i];
		}

		int sum1=0;
		for(int j=0; j<arr.length; j++){
			sum1=sum1+(sum%10);
			sum=sum/10;
		}
		return sum1;
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

		for(int i=0; i<n; i++){
			arr[i]=s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {

		int [] arr=takeinput();

		int arr1=sum(arr);

		System.out.println(arr1);
	}
}

