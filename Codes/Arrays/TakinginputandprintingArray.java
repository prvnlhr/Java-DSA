package Arrays;
import java.util.Scanner;

public class TakinginputandprintingArray {
	
	public static int [] takeInput(int n) {
		
		int [] arr = new int[n];
		
		for(int i =0; i<n ; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	static Scanner s=new Scanner(System.in);
	public static void main(String[] args){

		int n = s.nextInt();
		int arr[] = new int[n];

		for(int i=0; i<n; i++){
			arr[i]=s.nextInt();
		}

		int num = 0;
		for(int i = 0; i<=(n/2);i++){
			num = num + arr[i];
			System.out.print(num+" ");
		}
	}
}

