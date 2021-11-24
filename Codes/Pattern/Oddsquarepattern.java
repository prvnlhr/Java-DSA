package Pattern;

import java.util.Scanner;

public class Oddsquarepattern {

	public static void main(String[] args) {

		Scanner s=new Scanner (System.in);

		int n=s.nextInt();

		//this is outer loop
		for(int i=1;i<2*n;i=i+2)
		{
			for(int j=i;j<2*n;j=j+2)     //this loop prints :   135
			{                               //                  35
				System.out.print(j);        //                  5  
			}

			for(int j=1;j<i;j=j+2)   //this loop will start when i=3 it prints :  1
			{                                                    //               13
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

