package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class String_Unique_Character {
	
//-- Unique Character Function ---------------------------------------------------------------------------

	public static String uniqueChar(String str){
		String s = "";
		
		HashMap< Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0 ; i<str.length() ; i++) {
			
			if(map.containsKey(str.charAt(i))) {
				continue;
			}
			else {
				s = s + str.charAt(i);
				Character a = str.charAt(i);
				map.put(a , 1);
			}
		}
		return s;
		
	}
	
	
	
	
	
//-- Main Method ------------------------------------------------------------------------------------------
	public static void main(String[] args) {
				
		Scanner s = new Scanner(System.in);
		
		String str  = s.nextLine();
		
		String ans  = uniqueChar(str);
		System.out.println(ans);

	}

}
