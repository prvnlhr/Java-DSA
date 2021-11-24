package OOPS_1;

import java.util.Scanner;

public class polynomialUse {

	public static void main(String[] args) {


		Scanner s=new Scanner(System.in);
//taking n input for first polynomial size		
		int n=s.nextInt();
//taking degree input of p1
		int [] degree1=new int[n];
		for(int i=0; i<n; i++) {
			degree1[i]=s.nextInt();
		}
//taking coefficient input p1
		int [] coeff1=new int[n];
		for(int i=0; i<n;i++) {
			coeff1[i]=s.nextInt();
		}
//creating polynomial p1 ,setting coeff and degree
		polynomial p1 = new polynomial();
		for(int i=0; i<n; i++) {
			p1.setCoeff(degree1[i] , coeff1[i]);
		}

//taking n=array size for second polynomial		
		n=s.nextInt();
//taking degree input of p2
		int [] degree2 = new int[n];
		for(int i=0; i<n; i++) {
			degree2[i] = s.nextInt();
		}
//taking coefficient input p2
		int [] coeff2 = new int[n];
		for(int i=0; i<n; i++) {
			coeff2[i] = s.nextInt();
		}
//creating polynomial p2 ,setting coeff and degree
		polynomial p2 = new polynomial();
		for(int i=0; i<n; i++) {
			p2.setCoeff(degree2[i],coeff2[i]);
		}
		p1.print();
	}
}
