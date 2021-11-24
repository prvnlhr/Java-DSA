package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntersectionApproach3 {
	//Finding Intersection
		public static void intersections(int[] arr1, int[] arr2){
		
			int [] arr;
		if(arr1.length>arr2.length) {
			 arr=ArraySort(arr2);
		}
		else {
			 arr=ArraySort(arr1);
		}

		System.out.println();
		
	        if(arr1.length>arr2.length) {
        
	        	for(int i= 0; i<arr1.length; i++) {
        	 BinarySearch(arr , arr1[i] , 0 ,arr.length-1);
               }
	        }
        
         else if (arr2.length>arr1.length){
        	 
        	 for(int i= 0; i<arr2.length; i++) {
            	 BinarySearch(arr , arr2[i] , 0 ,arr.length-1);
                }
            }
	      }
        	 
       public static void BinarySearch(int [] arr , int num , int start, int end) {
	   
	      while(start<=end){

			int mid=(start+end)/2;

				if(num==arr[mid]) {
					System.out.println(num+" ");
					arr[mid]=Integer.MIN_VALUE;
					break;
				}
				else if(num >arr[mid]) { 		   
					start=mid+1;
				}
				else {
					end=mid-1;
			      }
			   }       
			}
       
             //Sorting Two arrays	
	        public static int[] ArraySort(int[] arr) {
			
//			Arrays.sort(arr);
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

	
