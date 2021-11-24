package Pattern;

import java.util.Scanner;

public class Characterpattern {

	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
		int n=s.nextInt();

		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=n) {

				char printchar= (char) ('A'+j-1);     // first we converted integer to character using cast corresponding ANsi values
				System.out.print(printchar);

				j=j+1;                       //updation
			}
			System.out.println();
			i=i+1     ;           //updation
		}
	}

}


