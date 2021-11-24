package Array_2D;

import java.util.Scanner;

public class Array2DTestQuesPrintRows {


	public static void print2dArray(int [][]input){

		int rows=input.length;
		int cols=input[0].length;

		int n=rows;

		for(int i=0; i<rows;i++){

			for(int k=0;k<n;k++){

				for(int j=0; j<cols;j++) {
					System.out.print(input[i][j]+" ");
				}
				System.out.println();
			}
			n--;
		}
	}

	public static int [][] takeinput(){

		Scanner s=new Scanner(System.in);
		int rows=s.nextInt();
		int cols=s.nextInt();

		int [][]input=new int[rows][cols];

		for(int i=0; i<rows;i++){
			for(int j=0; j<cols; j++){
				input[i][j]=s.nextInt();
			}
		}
		return input;
	}

	public static void main(String[] args) {

		int [][] input =takeinput();
		print2dArray(input);
	}
}
