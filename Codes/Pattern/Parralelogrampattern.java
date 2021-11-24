package Pattern;

import java.util.Scanner;

public class Parralelogrampattern {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		for(int i=1;i<=n;i++) {

			for(int j=2; j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=n;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}



