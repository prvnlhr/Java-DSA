package Array_2D;
import java.util.Scanner;

public class Array2DSPiralPrint {


	public static void SpiralPrint(int[][] input){

		int m=input.length;
		int n=input[0].length;

		int colstart=0; 
		int rowstart=0;
		int lastcol=n;
		int lastrow=m;

	
		int numelements=n*m;
		int count=0;

		while(count<numelements){

			for(int i=colstart;i<lastcol;i++) {
				System.out.print(input[rowstart][i]+" ");
				count++;
			}
			rowstart++;

			for( int i=rowstart;i<lastrow;i++) {
				System.out.print(input[i][lastcol-1]+" ");
				count++;
			}
			lastcol--;

			for(int i=lastcol-1;i>=colstart;i--) {
				System.out.print(input[lastrow-1][i]+" ");
				count++;
			}
			lastrow--;

			for(int i=lastrow-1;i>=rowstart;i--) {
				System.out.print(input[i][colstart]+" ");
				count++;
			}
			colstart++;
		}
	}
	public static int[][] takeinput(){
		Scanner s=new Scanner(System.in);
		int rows=s.nextInt();
		int cols=s.nextInt();
		int [][]input=new int[rows][cols];

		for(int i=0; i<rows;i++) {
			for(int j=0; j<cols; j++) {
				input[i][j]=s.nextInt();
			}
		}
		return input;

	}
	public static void main(String[] args) {

		int[] [] input=takeinput();
		SpiralPrint(input);
	}
}



