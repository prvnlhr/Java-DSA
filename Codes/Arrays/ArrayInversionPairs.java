package Arrays;

import java.util.Scanner;

public class ArrayInversionPairs {

	public static long solve(int [] input, int n) {
       
		//taking input of array element
		for(int i=0; i<input.length;i++){
			input[i]=s.nextInt();
		}

		int count=0;

		for(int i=0; i<input.length;i++){

			for(int j=i;j<input.length;j++){

				if(input[i]>input[j]) {
					count++;
				}
			}
		}
		return count;
	}

	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		
		int n=s.nextInt();
        int input[]=new int[n];
        long count=solve(input,n);
        System.out.println(count);
	}
}





