package Recursion;

import java.util.Scanner;

public class CountZerosUsingRecursion {
	static int count;
	public static int countZerosRec(int input){
		if(input==0) {
			return count;
		}

		if(input%10==0) {
			count++;
		}

		countZerosRec(input/10);
		return count;

	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int num = s.nextInt();
		countZerosRec(num);
		System.out.println(count);


	}
}
