package jnk;
import java.util.Scanner;

public class ArrayPractice4 {
	public static int[] change(int[] arr){

		int[] arr1= new int[arr.length];

		for(int i=0; i<arr.length; i++){
			arr1[i]=arr[i];
		}

		int pospos=0;
		int negpos=1;

		for(int j=0; j<arr.length; j++){

			if( arr1[j]>=0 ){
				arr[pospos]=arr1[j];
				pospos+=2;
			}
			if(arr1[j]<0){
				arr[negpos]=arr1[j];
				negpos+=2;
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


