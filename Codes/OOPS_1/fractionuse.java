package OOPS_1;

import java.util.Scanner;

public class fractionuse {
	
	public static void main(String[] args) {
		
//		Scanner s=new Scanner(System.in);
//		int numerator=s.nextInt();
//		int denominator=s.nextInt();
		
		fraction f1=new fraction(4,6);
//		f1.increment();
//	    f1.print();
	
		fraction f2=new fraction(4,8);
		
		f1.print();
		f2.print();
//		

//		f1.add(f2);           //method1 for adding f1 and f2
//	    f1.print();
		
	
		
		//method2 for adding f1 and f2
		fraction f3= fraction.add(f1 ,f2);      // <class_name>.<function_name>(arguments);
		f3.print();
	}
}
