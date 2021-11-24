package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListInBuiltFunctions{

	public static void main(String[] args) {


		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(1, 22);  //add at index
		System.out.println(list.get(0));  // get to get value
//		list.size();
		Collections.sort(list);  //sort
       
		for(int i = 0 ; i<list.size() ; i++) {
        	System.out.print(list.get(i)+" ");
        }
	}  
}

