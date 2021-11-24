package Recursion;

import java.util.Scanner;

public class ArraySumRecursion2 {

	static int result = 0;
	
	public static int sum(int[] input) {

		int index=0;
		
		int result=sumofArray(input , 0);
		return result;
	}
	  
	static int sum =0;
		public static int sumofArray(int [] input , int index) {
			
			if(index < input.length) {
				
				sum = sum + input[index];
				
				sumofArray(input , index+1);
			}
			return sum;
		}


	//method 2 CN
	//	public static int sum(int input[]) {
	//
	//	return sumofArray(input,0) ;
	//	
	//	}
	//    public static int sumofArray(int[] arr,int startIndex) {
	//		
	//        if(startIndex == arr.length){
	//            return 0;
	//        }
	//        int smallSum = sumofArray(arr,startIndex+1);
	//        int mySum = smallSum+arr[startIndex];
	//        return mySum;
	//    }
	//}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int [] input = new int[size];
		for(int i = 0; i<input.length; i++) {
			input[i] = s.nextInt();
		}
		int result = sum(input);
		System.out.println(result);

	}

}
