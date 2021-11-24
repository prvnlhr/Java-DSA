package Pattern;

import java.util.Scanner;

public class Numberpattern10 {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(1);
		for(int i=1; i<=n-1; i++){

			for(int l=1;l<=1;l++){
				int o=i;
				System.out.print(o);
				o=o+1;
			}
			for(int j=2; j<=i;j++) {
				System.out.print("0");
			}
			int p=i;
			for(int k=1;k<=1;k++) {
				System.out.print(p);
				p=p+1;
			}
			System.out.println();
		}
	}
}




