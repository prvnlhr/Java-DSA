package Pattern;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {

		try (Scanner s = new Scanner (System.in)) {
			int n=s.nextInt();

			int p=1;
			int i=1;
			while(i<=n)
			{
				//	p=i;// the value of p=i set value of p equal to the row i.e i its being printed in
				int j=1;
				while(j<=i) {
					//p=i;
					System.out.print(n-j+i);
					//					 p=1;
					j=j+1;
				}
				System.out.println();
				i=i+1;
				p=1;
			}
		}
	}
}


