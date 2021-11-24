package jnk;
import java.util.Scanner;

public class DuplicateelementinArray {

	public static int duplicate(int [] arr) {

//		for(int i=0;i<arr.length;i++){
//
//			for(int j=0;j<arr.length;j++){
//				
//				if(i!=j) {
//
//				if(arr[i]==arr[j]) {
//					return arr[i];
//					
//				}
//			}
//			}
//		}
//		return 0;
//	}
        
        
       int n=arr.length;
	    int sum =0;
    	for(int i=0;i<arr.length;i++){
            
            sum=sum+arr[i];
            
        }

	         int sumofNatural=((n - 1) * (n - 2)) / 2;
    
    return sum-sumofNatural;
}

 

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(duplicate(arr));
	}
}


