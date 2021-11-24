package jnk;
import java.util.Scanner;

public class ArrayExp {
    static Scanner s=new Scanner(System.in);
	
	public static int[] takeinput() {
        int n=s.nextInt();
		int arr[]=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	    }
	public static void printArray(int[] arr) {
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void swapAlternate(int arr[]){
        
		
		int n=arr.length;
		for(int i=0; i<n-1; i=i+2){
			int t=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=t;
			
		}
	
        }
	
	public static void main(String[] args) {
		
		int arr[]=takeinput();
		swapAlternate(arr);
		printArray(arr);
		
	}
		
	
}