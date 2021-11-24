package Pattern;

import java.util.Scanner;

public class Characterpattern3 {

	public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		char ch='A',p;
		ch= (char) (ch+n-1);    //this expression with start the code from last alphabet corresponding to n
		int i=1;                           //this will be executed at start only.
		while(i<=n)
		{
			p=ch;
			int j=1; 
			while(j<=i) {
				System.out.print(p);
				j=j+1;  
				p=(char) (p+1);
			}
			System.out.println();
			i=i+1; 
			ch--;	
		}
	}
}

		
//		   int i,j;
//	        char ch='A',c;
//	        
//	        
//	        
//	        ch = (char)( 'A' + n - 1);
//
//	        for (i = 1; i <= n; i++)
//	        {
//	            c='A';
//	            for (j = 1; j<= i; j++)
//	            {
//	                System.out.print(c);
//	                c++;
//	            }
//	            ch--;
//	            System.out.println();
//	        }
//	    }
//	
//		
//		
//		
//		
//		
		
		
	




