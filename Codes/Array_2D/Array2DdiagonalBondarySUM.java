package Array_2D;
import java.util.Scanner;


public class Array2DdiagonalBondarySUM {

	public static void DiaBoundSum(int[][] a){

		int m=a.length;
		int n=a[0].length;
		long sum = 0; 
		for (int i = 0; i < m; i++) { 
			for (int j = 0; j < n; j++) { 
				if (i == 0) 
					sum += a[i][j]; 
				else if (i == m - 1) 
					sum += a[i][j]; 
				else if (j == 0) 
					sum += a[i][j]; 
				else if (j == n - 1) 
					sum += a[i][j]; 
			} 
		}
		long sum2=sum;

		for(int l=1; l<n-1; l++) {
			sum2=sum2+a[l][l];
		}

		long sum3=sum2;
		int o=n-2;
		for(int p=1; p<n-1;p++) {
			if(o!=p) {
				sum3=sum3+a[o][p];
			}
			o--;
		}
		System.out.println(sum3);
	}

	public static int[][] takeinput(){

		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=m;
		int [][]a=new int[m][n];

		for(int i=0; i<m;i++) {
			for(int j=0; j<n; j++){

				a[i][j]=s.nextInt();
			}
		}
		return a;
	}
	public static void print2darray(int[][]arr2d) {

		int m=arr2d.length;
		int n=arr2d[0].length;

		for(int i=0; i<m;i++) {

			for(int j=0; j<n; j++) {

				System.out.print(arr2d[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[] [] a=takeinput();
		DiaBoundSum(a);
	}
}


