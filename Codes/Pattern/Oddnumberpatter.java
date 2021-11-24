package Pattern;

import java.util.Scanner;

public class Oddnumberpatter {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n=s.nextInt();


		for(int i=1;i<=n;i++){
			for(int j=1; j<=n+2; j++, j++) {
				if(j%2!=0)
					System.out.print(j);
			}
			System.out.println();
		}
	}
}









