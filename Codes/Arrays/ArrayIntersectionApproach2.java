package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntersectionApproach2 {

	//Finding Intersection
	public static void intersections(int[] arr1, int[] arr2){
		
	    int [] Arr1=ArraySort(arr1);
		int [] Arr2=ArraySort(arr2);
          int i=0;
          int j=0;
          
		  while( i < Arr1.length && j< Arr2.length ){
	  	       
			  if ( Arr1[i]==Arr2[j]){ 
	        	System.out.println(Arr1[i]);
		            i = i + 1;
		            j = j + 1;
		          }    
		 
		        else if ( Arr1[i] < Arr2[j] ) {
		                 i = i + 1;
		            }
		 
		        else {
		            j = j + 1;
		         }
	         }
		}
		
	//Sorting Two arrays	
        public static int[] ArraySort(int[] arr) {
	     int temp=0;
		for (int i = 0; i <arr.length ; i++)  {
	            for (int j = i + 1; j < arr.length; j++) { 
	                if (arr[i] > arr[j]) 
	                {
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
		return arr;
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
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		intersections(arr1, arr2);
	}
  }








