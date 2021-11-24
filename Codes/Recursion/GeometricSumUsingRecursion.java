package Recursion;
import java.util.Scanner;

public class GeometricSumUsingRecursion {
	
	
      static double result=0;
	private static double findGeometricSum(int k) {
          
		if(k==0){
//			System.out.println(1+result);
			return result+1;
		}
		result = result + (1/Math.pow(2,k)) ;
		  
		return findGeometricSum(k-1);
		
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int k= s.nextInt();
		double result =findGeometricSum(k);
		System.out.println(result);
	}


}
