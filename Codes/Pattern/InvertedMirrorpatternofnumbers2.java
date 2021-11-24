package Pattern;

import java.util.Scanner;

public class InvertedMirrorpatternofnumbers2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n=s.nextInt();

		for(int i=n;i>=1;i--){

			for(int j=1;j<=i;j++) {
				System.out.print(j);
			   }
			System.out.println();
		}
	}
}


















