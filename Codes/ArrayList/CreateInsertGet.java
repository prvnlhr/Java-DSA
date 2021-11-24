package ArrayList;

import java.util.ArrayList;

public class CreateInsertGet {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(23);   
		arr.add(24);
		arr.add(25);
		System.out.println("element at 2 "+arr.get(2));
		System.out.println("arr size "+ arr.size());
		
		
		
		ArrayList<Integer> arr1 = new ArrayList<>(10);
		
		arr1.add(20);
		arr1.add(30);
		arr1.add(40);
		System.out.println("arr1 size "+arr1.size());
		System.out.println(arr1.get(1));
		
		arr1.add(1, 23);
		System.out.println(arr1.get(1));
		
		System.out.println("arr1 elements: before set");
		for(int i = 0; i<arr1.size(); i++) {
			System.out.print(arr1.get(i)+" ");
		}
		System.out.println();
		System.out.println();
		
		arr1.set(1,55);
		System.out.println(arr1.get(1));
		
		System.out.println("arr1 elements: after set ");
		for(int i = 0 ; i<arr1.size(); i++) {
			System.out.print(arr1.get(i)+" ");
		}
		System.out.println();
		
		arr1.remove(1);
		
		System.out.println("after remove:");
		for(int i: arr1) {
			System.out.print(i+" ");
		}
		
		
	}

}
