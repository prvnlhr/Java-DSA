package Recursion;

import java.util.Scanner;

public class FirstIndexOfElement {
	
	public static int firstIndex(int input[], int x) {
		
		return find( input , x , 0);
	}
		
		public static int find( int [] input , int x , int index) {
			
			if(index == input.length-1) {
				return 0;
			}
			if(x==input[index]) {
				return index;
			}
		  return find(input , x , index+1);
			
		}

	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int [] input = new int[size];

		for(int i = 0; i<input.length; i++) {
			input[i] = s.nextInt();
		   }
		int num = s.nextInt();
        int indexfound = firstIndex(input , num);
		System.out.println(indexfound);
	}
}


