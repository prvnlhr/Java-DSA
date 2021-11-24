package Pattern;
import java.util.Scanner;

public class LargestNumberofArray {

	public static int largestnumber(int arr[]) {

		int max=Integer.MIN_VALUE;
		int n=arr.length;
		for(int i=0; i<n; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
		}
       public static int[] takeInput() {

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {

		arr[i]=s.nextInt();
	}
		return arr;
	}

	public static void main(String[] args) {

		int arr[]= takeInput();
     	int large=largestnumber(arr);
		System.out.println(large);
  }
}
