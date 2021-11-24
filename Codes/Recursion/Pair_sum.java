package Recursion;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Pair_sum {
	
	public  static void pairSum(int arr[] , int i , int  j ,  int x) {
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		if(i==j) {
			return ;
		}
		if(arr[i] + arr[j] == x) {
			System.out.println(arr[i]+" "+arr[j]);
			pairSum(arr , i + 1 , j , x);
		}
		pairSum(arr, i, j-1 , x);
			}
	

	public static void main(String[] args) {
		
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i< n ; i++) {
			arr[i] = s.nextInt();
			}
		pairSum(arr , 0 , n-1 , 5);
		}
	}
