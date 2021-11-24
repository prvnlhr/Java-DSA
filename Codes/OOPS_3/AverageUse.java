package OOPS_3;

import java.util.Scanner;

public class AverageUse {
	 public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
		 int a = s.nextInt();
		 int b = s.nextInt();
		 int c = s.nextInt();
		 
		 Average A = new Average();
		 
		 
		 A.Calculate(a,b,c);
		 
		 A.print();
		 
	}

}
