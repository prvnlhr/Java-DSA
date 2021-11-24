package jnk;
import java.util.Scanner;

public class ArrayPrintTripletsum {
	
	public static void pairSum(int[] arr, int x){
	     for(int i = 0 ; i<arr.length-2;i++){
	            for(int j = i+1 ; j<arr.length-1;j++){
	                for(int k = j+1 ; k<arr.length;k++){
	                    if(arr[i]+arr[j]+arr[k]==x){
	                        int max = Math.max(arr[i], Math.max(arr[j], arr[k]));
	                        int min = Math.min(arr[i], Math.min(arr[j], arr[k]));
	                        int mid = x - max - min;
	                        System.out.println(min + " " + mid + " " + max);
	                    }
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
		
		int[] input = takeInput();
		int x = s.nextInt();
		pairSum(input, x);
	}
}


