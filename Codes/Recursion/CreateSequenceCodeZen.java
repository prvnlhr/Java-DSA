package Recursion;

import java.util.Scanner;

public class CreateSequenceCodeZen {
	//----------------------------------------------------------------------------------------------
	public static void printSequence(int range) {
	
			seq(range , 1);
		}
		static boolean flag;
		public static void seq(int range , int n) {
	
			if(n>range) {
				return;
			}
			boolean flag =check(n);
			if(flag == true) {
				System.out.println(n);
			}
			seq(range , n+1);
		}
	
	
	
		static boolean res = true;
		public static boolean check(int n) {
	
			if(n==0) {
				return res;
			}
			int a = n%10;
			if(a==2 || a==5) {
				n= n /10;
				res = true;	
				check(n);
			}
			else {
				res = false;
			}
			return res;
		}




	//----------------------------------------------------------------------------------------------
	public static void main(String[] args) {

		Scanner s  = new Scanner(System.in);
		int range = s.nextInt();
		//	System.out.println(22%20);
		printSequence(range);
		//		System.out.print(check(range));
	}
}
//----------------------------------------------------------------------------------------------------------






