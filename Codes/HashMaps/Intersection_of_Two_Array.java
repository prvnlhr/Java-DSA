package HashMaps;

import java.util.HashMap;

public class Intersection_of_Two_Array {
//-- Array Intersection Function:
 
	public static void intersection(int[] arr1, int[] arr2){
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

		for(int i : arr1 ) {

			if(map.containsKey(i)) {
				int value  = map.get(i);
				map.put(i, value+1);
			}
			else {
				map.put(i, 1);
			}
		}

		for(int k : arr2) {
			if(map.containsKey(k)) {
				int freq =  map.get(k);
				if(freq >0 ) {
					System.out.print(k+" ");
					map.put(k, freq-1);
				}
			}
		}
	}

//---------------------------------------------
//-- Main Method:
	
	public static void main(String[] args) {
		ArrayInputAndPrint input  = new ArrayInputAndPrint();
		int [] arr1 = input.takeInput();
		int [] arr2 = input.takeInput();
	
		intersection(arr1, arr2);
		
		}
	}
