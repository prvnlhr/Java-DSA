package DP;

import java.util.Scanner;

public class Edit_Distance {
//__ EDIT DISTANCE FUNCTION__________________________________________
	public static int editDistance(String s1, String s2){
		int n = s1.length()-1;
		int m = s2.length()-1;
		return editDistanceREC(s1, s2, m, n);
	}
	public static int editDistanceREC(String s1, String s2 , int m , int n){
	
		if(m == 0) {
			return n;
		}
		if(n == 0) {
			return m;
		}
		if(s1.charAt(m-1)==s2.charAt(n-1)) {
			return  editDistanceREC(s1, s2 , m-1 , n-1);
		}
		  return 1 + min(editDistanceREC(s1, s2, m, n - 1), // Insert 
				  editDistanceREC(s1, s2, m - 1, n), // Remove 
				  editDistanceREC(s1, s2, m - 1, n - 1) // Replace 
                  ); 
				
	}
	static int min(int x, int y, int z) 
    { 
        if (x <= y && x <= z) 
            return x; 
        if (y <= x && y <= z) 
            return y; 
        else
            return z; 
    } 

//__ MAIN METHOD__________________________________________________
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		int ans = editDistance(s1, s2);
		System.out.println(ans);
		
	}

}
