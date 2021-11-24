package Array_2D;
import java.util.Scanner;

public class Array2DrowiseSum {

	public static void rowiseSum(int[][]arr2d){

		int ans=0;
		int rows=arr2d.length;
		int col=arr2d[0].length;

		for(int i=0; i<rows; i++) {
			int sum=0;
			for(int j=0; j<col; j++) {
				sum=sum+arr2d[j][i];
			}
			System.out.print(sum+" ");
		}
	}

	public static int[][] takeinput(){

		Scanner s=new Scanner(System.in);
		int rows=s.nextInt();
		int col=s.nextInt();
		int [][]arr2d=new int[rows][col];

		for(int i=0; i<rows;i++) {
			for(int j=0; j<col; j++){
				arr2d[i][j]=s.nextInt();
			}
		}
		return arr2d;
	}
	public static void print2darray(int[][]arr2d) {

		int rows=arr2d.length;
		int col=arr2d[0].length;

		for(int i=0; i<rows;i++){

			for(int j=0; j<col; j++){
				System.out.print(arr2d[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[] [] arr2d=takeinput();
		rowiseSum(arr2d);
	}
}


//		//Rowise sum
//		int ans=0;
//		int rows=arr2d.length;
//		int col=arr2d[0].length;
//		
//		for(int i=0; i<rows; i++) {
//			int sum=0;
//			for(int j=0; j<col; j++) {
//				
//				sum=sum+arr2d[i][j];
//			}
//			System.out.print(sum+" ");
//		}
//		   	
//			
//		}
//ColoumnWise sum
