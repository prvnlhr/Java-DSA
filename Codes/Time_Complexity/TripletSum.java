package Time_Complexity;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {

	public static void FindTriplet(int[] arr, int num){
		Arrays.sort(arr); 
		int n =arr.length;

		for (int i = 0;  i < n - 1; i++)  
		{ 
			// initialize left and right 
			int l = i + 1; 
			int r = n - 1; 
			int  x = arr[i]; 
			while (l < r)  
			{ 
				if (x + arr[l] + arr[r] == num)  
				{ 
					// print elements if it's  
					// sum is given sum. 
					System.out.println(x + " " + arr[l] +" " + arr[r]); 
					l++; 
					r--; 
				} 

				// If sum of three elements  
				// is less than 'sum' then  
				// increment in left 
				else if (x + arr[l] + arr[r] < num) 
					l++; 

				// if sum is greater than  
				// given sum, then decrement 
				// in right side 
				else
					r--; 
			} 
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
		int num = s.nextInt();
		TripletSum.FindTriplet(arr, num);
	}

}



