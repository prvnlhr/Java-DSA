package Array_2D;
import java.util.Scanner;

public class Array2DRowColSumLArgest {

	public static void findLargest(int input[][]){

		int newmax=0;
		int flag=0;
		int rownum=0;
		int rows=input.length;
		int col=input[0].length;

		//finding maximum of row
		for(int i=0; i<rows; i++){
			int sum=0;
			for(int j=0; j<col; j++){
				sum=sum+input[i][j];

				if(sum>newmax) {

					newmax=sum;
					rownum=i;
				}
			}
		}
		//finding maximum of column

		for(int j=0; j<col; j++) {
			int sum2=0;
			for(int i=0; i<rows; i++) {
				sum2=sum2+input[i][j];

				if(sum2>newmax) {
					newmax=sum2;
					rownum=j;
					flag=1;
					
				}
			}
		}

		if(flag==0) { 
			System.out.println("row"+" "+rownum+" "+newmax);
		}
		else if(flag==1) {
			System.out.println("column"+" "+rownum+" "+newmax);	
		}
	}

	static Scanner s = new Scanner(System.in);

	public static int[][] takeInput2D(){

		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}

	public static void main(String[] args) {

		int input[][] = takeInput2D();
		findLargest(input);
	}
}




