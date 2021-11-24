package Pattern;

import java.util.Scanner;

public class Numberpattern11 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1; i<=n; i++) {
			int o=1;
			for(int j=n; j>=i; j--) {
				System.out.print(o);
				o=o+1;
			}
			System.out.println();
		}
	}
}
