package jnk;

import java.util.Scanner;

public class ArrayEquillibriumIndex {

	public static int arrayEquilibrium(int [] arr){
		
		//this is similar to first method provided at geeksforgeeks website
		//there is method 2 at geeksforgeeks which is more efficient 
		//as it contains on two loops

		//loop for changing index i
		for(int i=0;i<arr.length;i++){
		//loop for finding sum at leftside of index
			int sum1=0;
			for(int j=0; j<i;j++){
				sum1=sum1+arr[j];
			}
		//loop for finding sum at rightside of index
			int sum2=0;
			for(int k=i+1;k<arr.length;k++){
				sum2=sum2+arr[k];
			}
   		//deciding if leftside sum equal rightside sum or not
			if(sum1==sum2) {
			 return i;
			}
		}
		return -1;
	}

   public static int [] takeinput(){

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
        int [] arr= new int[n];
      
        for(int i=0; i<arr.length; i++){
			arr[i]=s.nextInt();
		}
        return arr;
	}

	public static void main(String[] args) {

		int[] arr =takeinput();
		int index=arrayEquilibrium(arr);
		System.out.println(index);
	}
}



