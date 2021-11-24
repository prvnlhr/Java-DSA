package Arrays;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {

		try (Scanner s = new Scanner (System.in)) {
			int n=s.nextInt();

			int p=1;
			int i=1;
			while(i<=n){
				int j=1;
				while(j<=i) {
					System.out.print(p);
					p=p+1;
					j=j+1;
				}
				System.out.println();
				i=i+1;
			}
		}
	}
}


