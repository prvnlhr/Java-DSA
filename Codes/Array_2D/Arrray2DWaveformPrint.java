package Array_2D;
import java.util.Scanner;

public class Arrray2DWaveformPrint {
	public static void DiaBoundSum(int[][] input){

		for (int i = 0; i < input[0].length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j <=input.length-1; j++) {
					System.out.print(input[j][i]+" ");
				}
				System.out.println();
			}
			else if (i % 2 != 0) {
				for (int j = input.length - 1; j >= 0; j--) {
					System.out.print(input[j][i]+" ");
				}
				System.out.println();
			}
		}
	}

	public static int[][] takeinput(){

		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int [][]input=new int[m][n];

		for(int i=0; i<m;i++){
			for(int j=0; j<n; j++){
				input[i][j]=s.nextInt();
			}
		}
		return input;
	}

	public static void print2darray(int[][]arr2d) {

		int m=arr2d.length;
		int n=arr2d[0].length;

		for(int i=0; i<m;i++){

			for(int j=0; j<n; j++){
				System.out.print(arr2d[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[] [] input=takeinput();
		DiaBoundSum(input);
	}
}


//int m=input.length;
//int n=input[0].length;
//  int wavedir=0; 
//  
//  for (int i =0; i<m-1; i++) { 
//
//	  if(wavedir==1) {
//
//		  for (int j =n-1; j>=0; j--) {
//			  
//			  System.out.println(input[i][j]);
//			  wavedir=0;
//		    }
//	      }
//		  
//		  
//		  else if(wavedir==0) {
//
//			  for(int k=0;k<n-1;k++) {
//				  
//			   System.out.println(input[i][k]);
//		  }
//	  }
//  }
////  System.out.println();
//}




