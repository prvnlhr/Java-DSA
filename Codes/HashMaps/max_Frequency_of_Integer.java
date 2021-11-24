package HashMaps;

import java.util.HashMap;
import java.util.Set;

public class max_Frequency_of_Integer {

//------------------------------------------------------------------------
	//-- Max frequency of integer in array function:

	public static int maxFrequencyNumber(int[] arr){

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i : arr) {
			if(map.containsKey(i)) {
				map.put(i , map.get(i)+1);
			}
			else {
				map.put(i , 1);
			}
		}
		for(int k :	map.keySet()) {
			System.out.print(k+" ");
		}
		System.out.println();
		for(int i : arr) {
			System.out.println(i+" "+map.get(i)+" ");			
		}

		int max = 0 ; 
		int ans = Integer.MIN_VALUE;
		for(int i : arr) {
			if(map.get(i) > max) {
				max = map.get(i);
				ans = i;
			}
		}
		return ans;
	}
//-----------------------------------------------------
	//-- main method
	public static void main(String[] args) {
		ArrayInputAndPrint input = new ArrayInputAndPrint();
		int [] arr = input.takeInput();
		System.out.print(maxFrequencyNumber(arr));
	}
}
