package Arrays;
import java.util.Scanner;

public class ArrayLeadersinArray {

	public static void leaderarray(int[] arr ){
        //My solution

		for (int i = 0; i < arr.length; i++){ 
			int j; 
			int  count=i;

		for (j = i+1; j < arr.length; j++){ 
				if (arr[i] >= arr[j]){
					count++;
				}
				else {
					break;
				}

				if(count==arr.length-1){
					System.out.println(arr[i]);
				}
			}
		}
		System.out.println(arr[arr.length-1]);
	}
	


		public static int[] input(){

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();

		int[] arr=new int[n];

		for(int i=0; i<n; i++){
			arr[i]=s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {

		int [] arr=input();

		leaderarray(arr);
	}
}


//Coding Ninja Github sol

//		  System.out.print(arr[arr.length-1]);
//		  
//		for (int i = 0; i < arr.length; i++)  
//		{ 
//			int j; 
//			for (j = i + 1; j < arr.length; j++)  
//			{ 
//				if (arr[i] <= arr[j]) 
//					break; 
//			} 
//			if (j == arr.length) { // the loop didn't break 
//			System.out.print(arr[i] + " "); 
//		}
//		}
//	 
//	System.out.print(arr[arr.length-1]);
//}
