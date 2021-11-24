package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class removeDuplicates_Using_HashMap {

//----------------------------------------------------------------------------------------------------------
//-- Remove Duplicates Function :
	public static ArrayList<Integer> removeDuplicates(int [] arr){
		
		ArrayList<Integer> output = new ArrayList<Integer>();
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		for(int i = 0; i< arr.length ;i++) {
		
			if(map.containsKey(arr[i])){
				continue;
			}
			output.add(arr[i]);
			 map.put(arr[i], true);
		}
		return output;
	}
	

//-------------------------------------------------------------------------------
//-- Main Method:
	public static void main(String[] args) {
		
		ArrayInputAndPrint input = new ArrayInputAndPrint();
		int [] arr = input.takeInput();
		ArrayList<Integer> output = removeDuplicates(arr);
		for(int  i : output) {
			System.out.print(i+" ");
		}
	}
}
