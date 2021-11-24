package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPairSum2 {
	private static void Pairs(int[] arr , int num) {
        
		Arrays.sort(arr);
        int start = 0;
		int end = arr.length-1;
	
		while(start<end) {

			if(arr[start] +arr[end]== num) {
				
				if(arr[start] == arr[end]) {
					int count = end -start +1 ;
					int n= count-1;
					int totalcount =((n)*(n+1))/2;

					while(totalcount >0) {
						System.out.println(arr[start]+" " +arr[end]);
						totalcount--;
						}
					start = end;
				}
				else {
					int countStart =0, countEnd=0;
					int temp = arr[start], i=start;
					while(arr[i] == temp && i<end) {
						i++;
						countStart++;
					}
					temp = arr[end];
					int j =end;
					while(arr[j]== temp && j>start) {
						j--;
						countEnd++;
					}
					start =i;
					end  = j;
					int totaltimes= countStart* countEnd;
					
					while(totaltimes>0) {
						System.out.println(arr[start-1]+" "+arr[end+1]);
						totaltimes--;
					}
                 }
			}
			else if(arr[start]+ arr[end]<num)
				start++;
			else
				end--;
			}

 
      














		//		while(i<j && i!=j) {
		//           
		//			if(arr[i]+arr[j]==sum) {
		//				
		//				System.out.println(arr[i]+","+arr[j]);
		//
		//				if(arr[i]==arr[i+1] && arr[j]!=arr[j-1]) {
		//					i++;
		//				}
		//				
		//				if(arr[i]==arr[i+1] && arr[j]==arr[j-1]) {
		//					j--;
		//					}
		//				
		//				if (arr[i]!=arr[i+1] && arr[j]!=arr[j-1]){
		//					i++;
		//					j--;
		//				}
		//			}
		//
		//			else if(arr[i]+arr[j]>sum) {
		//				j--;
		//			}
		//			else if(arr[i]+arr[j]<sum) {
		//				i++;
		//			}
		//		
		//		}

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
		int sum = s.nextInt();
		Pairs(arr,sum);
	}
}




