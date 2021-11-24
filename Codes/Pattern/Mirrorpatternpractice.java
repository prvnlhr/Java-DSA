package Pattern;

import java.util.Scanner;

public class Mirrorpatternpractice {

	public static void main(String[] args) {

       Scanner s=new Scanner(System.in);

		int n= s.nextInt();

		int f=1;
		for(int i=1; i<=n;i++) {

			for(int j=1;j<=n-i;j++) {

				System.out.print(" ");	
			}

			for(int k=1;k<=i;k++) {

				System.out.print(n);

			}
			for(int l=i-1;l>=1;l--) {

			}
			System.out.println();
		}
	}
}





