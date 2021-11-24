package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConsecutiveOrNot {

	public static boolean containsConsecutiveNumbers(int [] Sortedinput) {

		boolean result;

		int count=0;
		
		for(int i=0; i<Sortedinput.length;i++) {
			
			for(int j=i+1; j<Sortedinput.length;j++) {
			   
				if(Sortedinput[j]-Sortedinput[i]==1 || Sortedinput[j]-Sortedinput[i]==0) {
			            count++;
			            break;
		           }
			   }
		   }
		
		if(count==Sortedinput.length-1) {
            result=true;
	      }
		else {
			result=false;
		}
		return result;
	}
		

	public static int[] arraysort(int[] input) {
		Arrays.sort(input);
		return input;
	}



	public static int[] takeinput(){

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] input=new int[n];

		for(int i=0; i<input.length;i++) {
			input[i]=s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {

		int input[]=takeinput();
		int [] Sortedinput=arraysort(input);

		boolean result=containsConsecutiveNumbers(Sortedinput);
		System.out.println(result);


	}
}
