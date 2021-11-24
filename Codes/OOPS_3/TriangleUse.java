package OOPS_3;

import java.util.Scanner;

public class TriangleUse {
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int side1 = s.nextInt();
		int side2 = s.nextInt();
		int side3 = s.nextInt();
		
	   Triangle T = new Triangle(side1, side2, side3);
	   
	   System.out.println(T.Area());
	   System.out.println(T.Perimeter());
	        
		 
//WITHOUT CONTRUCTOR		
//		T.a = 3;
//		T.b = 4;
//		T.c = 5;
//		
//	   System.out.println(T.getArea());
//		System.out.println(T.getPerimeter());
//	
	}
}


