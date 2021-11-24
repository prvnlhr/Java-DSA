package Array_2D;
import java.util.Scanner;

public class Array2DLargestColSum {
	public static void LargestColSum(int[][]arr2d){
		int max=0;
		int newmax = 0;
		int rownum = 0;
		int rows = arr2d.length;
		int col = arr2d[0].length;

		for(int j=0; j<col; j++) {
			int sum=0;
			for(int i=0; i<rows; i++) {
				sum=sum+arr2d[i][j];
				if(sum>newmax) {
					newmax=sum;
					rownum=j;
				}
			}
		}
		System.out.println("row"+" "+rownum+" "+newmax);
	}


	public static int[][] takeinput(){

		Scanner s=new Scanner(System.in);
		int rows=s.nextInt();
		int col=s.nextInt();
		int [][]arr2d=new int[rows][col];

		for(int i=0; i<rows;i++) {
			for(int j=0; j<col; j++) {
				arr2d[i][j]=s.nextInt();
			}
		}
		return arr2d;
	}

	public static void print2darray(int[][]arr2d) {

		int rows=arr2d.length;
		int col=arr2d[0].length;

		for(int i=0; i<rows;i++) {

			for(int j=0; j<col; j++) {
				System.out.print(arr2d[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[] [] arr2d=takeinput();
		LargestColSum(arr2d);

	}
}


