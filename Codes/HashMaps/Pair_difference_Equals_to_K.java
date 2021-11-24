package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class Pair_difference_Equals_to_K {
//-- Pair difference equals to k -----------------------------------------

    public static void findPairsDifferenceK(int[] input, int k){
    	
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	for(int i : input) {
    		map.put(i, i);
    	}
    	
    	for(int j : input) {
    		int a = j+k;
    		if(map.containsKey(a)) {
    			System.out.println(j +" "+ a);
    		}
    	}
     }
//-- Main Method ----------------------------------------------------

    public static void main(String[] args) {
    	ArrayInputAndPrint input = new ArrayInputAndPrint();
    	int [] arr = input.takeInput();
    	Scanner s = new Scanner(System.in);
    	int  k = s.nextInt();
    	findPairsDifferenceK(arr , k);
    }
}
