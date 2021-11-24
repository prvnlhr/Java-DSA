package Pattern;
import java.util.Scanner;
public class Zerostarpattern {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		for(int i=1; i<=n; i++) {

			for(int j=2;j<=i;j++) {
				System.out.print("0");
			}
			for(int k=0;k<1; k++) {
				System.out.print("*");
			}
			for(int l=n; l>i;l--) {
				System.out.print("0");
			}
			for(int o=1;o<=1;o++) {
				System.out.print("*");
			}
			for(int m=n-1;m>=i;m--) {
				System.out.print("0");
			}
			for(int p=1;p<=1;p++) {
				System.out.print("*");
			}
			for(int r=2;r<=i;r++) {
				System.out.print("0");
			}
			System.out.println();
		}
	}
}