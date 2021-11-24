package HashMaps;

public class MapUse {
	
	public static void main(String[] args) {

		Map<String, Integer> map = new Map<String, Integer>();
		
		map.insert("abc", 1);
		map.insert("efg", 2);
		map.insert("lmn", 3);
		
		System.out.println(map.getValue("efg"));
		for(int i = 0 ; i<20 ; i++) {
			map.insert("abc"+i,i+1 );
			System.out.println(map.loadFactor());
		}

		map.removeKey("abc7");
		map.removeKey("abc3");

		for(int  i = 0 ; i<20 ; i++) {
			System.out.println("abc"+i+" "+ map.getValue("abc"+i));
		}
		System.out.println(map.getValue("abc3"));
	}

}
