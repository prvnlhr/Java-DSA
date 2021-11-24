package Pattern;

import java.util.Scanner;

public class Halfdiamondwithenumbers {

	public static void main(String[] args) {

		int N, i, j;

		Scanner s= new Scanner(System.in);
		N = s.nextInt();
		System.out.print("*\n");  //this will print the starting top star
		for(i=1; i<=N; i++)
		{
			for(j=1; j<=i; j++)
			{
				if(j == 1)
					System.out.print("*");
				System.out.print(j);
			}
			for(j=i-1; j>=1; j--)
			{		
				System.out.print(j);
			}
			System.out.println( "*");
		}

		for(i=N-1; i>=1; i--)
		{	
			for(j=1; j<=i; j++)
			{
				if(j == 1)
					System.out.print("*");
				System.out.print(j);
			}
			for(j=i-1; j>=1; j--)
			{
				System.out.print(j);
			}

			System.out.println("*");
		}
		System.out.println("*");    //this will print the ending star
		System.out.println( );
	}
}






