package Pattern;

import java.util.Scanner;

public class Oddeven2 {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int evensum=0;

		int last=n%10;
		while(n>0) {

			if(last%10==0) {
				System.out.println(evensum);
			}
		}
	}
}
