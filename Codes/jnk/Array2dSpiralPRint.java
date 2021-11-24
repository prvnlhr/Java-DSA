package jnk;
import java.util.Scanner;

public class Array2dSpiralPRint{

	public static void spiralPrint(int matrix[][]){
		// Write your code here

	int rs = 0;
		int re = matrix.length - 1;
		int cs = 0;
		int ce = matrix[0].length - 1;
		int i,j,c = 1;
		if((re + 1) ==1) {
			for(j = cs;j <= ce;j++ ) {
				System.out.print(matrix[rs][j] + " ");
			}
		}
		else if((ce + 1) ==1) {
			for(i = rs;i <= re;i++) {
				System.out.print(matrix[i][cs] + " ");	
			}
		}
		else {
		while(c <= (matrix.length*matrix[0].length)) {
			for(j = cs;j <= ce;j++) {
				System.out.print(matrix[rs][j] + " ");
				c++;
			}
			rs++;
			for(i = rs;i <= re;i++) {
				System.out.print(matrix[i][ce] + " ");
				c++;
			}
			ce--;
			for(j = ce ;j >= cs ;j--) {
				System.out.print(matrix[re][j] + " ");
				c++;
			}
			re--;
			for(i = re;i >= rs;i--) {
				System.out.print(matrix[i][cs] + " ");
				c++;
			}
			cs++;
		}
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
		int[][] input = takeinput();
		spiralPrint(input);
	}

}
	

	

