package Pattern;

import java.util.Scanner;

public class Diamondpattern{

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();


		for (int i= 1; i<= (n+1)/2; i++)
		{
			for (int j=((n+1)/2)-1; j>=i;j--)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++)
			{
				System.out.print("*");
			} 
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}





		//
		for (int i= 2; i<=(n+1)/2; i++)
		{
			for (int j=2; j<=i;j++)
			{
				System.out.print(" ");
			}
			for (int k=(n+1)/2;k>=i;k--)
			{
				System.out.print("*");
			} 
			for(int l=((n+1)/2)-1;l>=i;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

