package Pattern;

import java.util.Scanner;

public class Halfdiamond{

    public static void main(String[] args) {

    	Scanner s=new Scanner(System.in);

    	int n=s.nextInt();

    	for(int i=1;i<=n;i++) {

    		for(int j=n-1;j>=i;j--) {
    			System.out.print(" ");
    		}
    		for(int k=1;k<=i;k++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}

    	int i=1;
    	for(int l =1;l<=n;l++) {

    		for(int m=n-1;m>=i;m++) {
    			System.out.print(" ");
    		}
    		for(int o=n;o>=i;o--) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
