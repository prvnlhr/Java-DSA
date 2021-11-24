package Pattern;

import java.util.Scanner;

public class Characterpattern2 {

	public static void main(String[] args) {
        
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();

		int i=1;
		while(i<=n)
		{
			char p= (char) ('A'+i-1);      
			int j=1; 
			while(j<=i) {
				System.out.print(p);
				p= (char)(p+1);           //this expression changes the value of A to B and so on..after every character printing.
				j=j+1;                       //updation
			}
			System.out.println();
			i=i+1;           //updation
		}
	}
}


