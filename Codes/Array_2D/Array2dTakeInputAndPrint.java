package Array_2D;
import java.util.Scanner;

public class Array2dTakeInputAndPrint {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of rows:");
		int row=s.nextInt();
		System.out.println("Enter no. of coloumns:");
		int col=s.nextInt();

		int[][]arr2d = new int[row][col];

		for(int i = 0; i<row; i++) {
			System.out.println("Entering row... "+(i+1));
			System.out.println();
			for(int j=0; j<col; j++) {

				System.out.println("Enter"+ " rows "+i +" col "+j+" element: "); 
				arr2d[i][j] = s.nextInt();
			}
		}
		System.out.println("Desired Array:");
		System.out.println();

		for(int i=0; i<row;i++){

			for(int j=0; j<col; j++){
				System.out.print(arr2d[i][j]);
			}
			System.out.println();
		}
	}
}