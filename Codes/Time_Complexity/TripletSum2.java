package Time_Complexity;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSum2 {

	public static void FindTriplet(int[] arr, int x){
		
        Arrays.sort(arr);
        for(int i = 0;i < arr.length -2;i++){
            for(int j = i + 1;j < arr.length;j++){
              for(int k = j + 1;k < arr.length;k++){
                if((arr[i] + arr[j] + arr[k]) == x)
                 System.out.print(arr[i] + " " + arr[j] + " " + arr[k] + "\n");
              }
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
		TripletSum2.FindTriplet(arr, num);
	}

}



