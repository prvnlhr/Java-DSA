package DP;

import java.util.HashMap;
import java.util.Scanner;

public class ByteLandian {
	
//-- Byte Landian Function ------------------------------------------------------------------

//__ MEMOIZATION DP USING HASHMAP :________________________________________________________
	public static long bytelandian_UsingHasmap(long n ){
	
		long [] dp = new long[(int) (n+1)];
		byteUsingArray(n, dp);
		HashMap<Long, Long> result = new HashMap< Long, Long>();
		return byteHelper(n, result);
		}

	public static long byteHelper(long n , HashMap<Long, Long> result) {

		long a = n/2;
		long b = n/3;
		long c = n/4;
		long ans = a + b + c;

		if (result.containsKey(n)) { 
			return result.get(n);
		}

		if(n > ans) {
			result.put(n , n);
			return n;
		}
		else{
			long maxHalfPortion = byteHelper(n/2 , result);
			long maxThirdPortion = byteHelper(n/3 , result);
			long maxFourthPortion = byteHelper(n/4 , result);

			long finalresult = maxHalfPortion + maxThirdPortion + maxFourthPortion;
			
			result.put( n, finalresult);
			
			return finalresult;
		}
	}
//__ MEMOIZATION  DP USING ARRAY :______________________________________________________________________
	public static long byteUsingArray(long n , long [] dp) {

		long a = n/2;
		long b = n/3;
		long c = n/4;
		long ans = a + b + c;

		if (dp[(int) n]== -1) { 
		}

		if(n > ans) {
			dp[(int) n] = n;
			return n;
		}
		else{
			long maxHalfPortion = byteUsingArray(n/2 , dp);
			long maxThirdPortion = byteUsingArray(n/3 , dp);
			long maxFourthPortion = byteUsingArray(n/4 , dp);

			long finalresult = maxHalfPortion + maxThirdPortion + maxFourthPortion;
			dp[(int) n] = finalresult;
			return finalresult;
		}
	}
//__ RECURSIVE :___________________________________________________________________________________
	public static long byteLandianREC(long n ) {
		if( n == 0) {
			return 0;
		}
		long a = n/2;
		long b = n/3; 
		long c = n/4;
		long ans  = a + b + c;
		if( ans < n) {
			return n ;
		}
		long max = byteLandianREC(a) + byteLandianREC(b) + byteLandianREC(c);
		return max ;
	}

//-- Main Method ---------------------------------------------------------------------

	public static void main(String[] args) {

		Scanner s  = new Scanner(System.in);
		long  n  = s.nextLong();
//-recursive call---------------------------------------------------	
//		long ans = byteLandianREC(n);
//-----------------------------------------------------
//		long ans  = bytelandian_UsingHasmap(n);
		
//-using array---------------------------------------------------
		long [] dp = new  long [(int) (n+1)];
		for(int i = 0 ; i<=n ; i ++) {
			dp[i] = -1;
		}
		long ans = byteUsingArray( n ,dp);
//-----------------------------------------------------
		System.out.println(ans);
	}
}
