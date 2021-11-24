package Time_Complexity;

import java.util.Scanner;

public class test4 {
	public static int maximumProfit(int budget[]) {
	
		budget = mergesort(budget);
		int cost[]= new int[budget.length];
		
		
		// if array is sorted we can easily find the cost/profit array by just multiplying the array element by 0 , 2 , 3 ,4 ...
		//as array is in increasing order, if we pick first element,  all elements after it will be greater. so we can sell 
		// at all prices after element 1, so we can simply multiply no of elements after 1 including 1 , if i=0 i.e length-i.
		for(int i =0; i<budget.length; i++) {
			System.out.println(budget[i]+" "+ (budget.length-i));
			cost[i]= budget[i]*(budget.length-i);
	}
		for(int i = 0; i<budget.length; i++) {
			System.out.print(cost[i]+" ");
		}
		int max = Integer.MIN_VALUE;
		for(int i: cost) {
			if(i>max)
				max=i;
			
		}
		return max;
	}
	public static int[] merge(int arr1[], int arr2[] ){
	
		int i =0, j=0, k=0;
		int output[]= new int[arr1.length+ arr2.length];
		while((i<arr1.length)&&(j<arr2.length)) {
			if(arr1[i]<=arr2[j]) {
				output[k]= arr1[i];
				i++;
				k++;
			}
			else {
				output[k]=arr2[j];
				k++;
				j++;
			}
			}
		while(i<arr1.length) {
			output[k] = arr1[i];
			i++;
			k++;
			
		}
		while(j<arr2.length) {
			output[k]=arr2[j];
			j++;
			k++;
			
		}
		return output;
		
	}
	
	public static int [] mergesort(int input[]) {
		if(input.length==1) {
			int out[]= {input[0]};
			return out;
			
		}
		int lefthalf[]=new int [input.length/2];
		int righthalf[]= new int [input.length-(input.length/2)];
		for(int i= 0; i<lefthalf.length; i++)
			lefthalf[i]= input[i];
		for(int i=0; i<righthalf.length; i++)
			righthalf[i]=input[lefthalf.length+i];
		lefthalf = mergesort(lefthalf);
		righthalf = mergesort(righthalf);
		input= merge(lefthalf, righthalf);
		return input;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++)
			input[i] = s.nextInt();
		
		System.out.println(maximumProfit(input));
	}

}
	

