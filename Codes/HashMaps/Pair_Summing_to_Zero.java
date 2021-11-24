package HashMaps;

import java.util.HashMap;

import Arrays.Array;

public class Pair_Summing_to_Zero {
//--------------------------------------------------------
//-- Pair Sum == zero Function:
	public static void PairSum(int[] input ) {
		
		HashMap<Integer , Integer > map = new HashMap<Integer, Integer >();

		for(int i : input) {
		
			int a = ~(i-1);

			if(map.containsKey(a)){
				int value =  map.get(a);
//				System.out.println("value"+map.get(a) );
				if( value == 1) {
					System.out.println(i+" "+(~(i-1)));
				}
				if(value == 0) {
					System.out.println((~(i-1))+" "+i);
				}
			}
			else {
				if(i < 0 ) {
					map.put(i , 0);
				}
				if(i > 0) {
					map.put(i, 1);

				}
			}
		}
	}
//-------------------------------------------------------------
//-- Main Method:
	public static void main(String[] args) {
		 ArrayInputAndPrint input = new ArrayInputAndPrint();
		 int arr[] = input.takeInput();
		 PairSum(arr);
		}
	}
