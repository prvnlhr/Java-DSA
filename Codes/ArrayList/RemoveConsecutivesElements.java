package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveConsecutivesElements {

	public static ArrayList<Integer> RemoveConecElement(int[] arr){

		ArrayList<Integer> ArrList = new ArrayList<>();

		ArrList.add(0,arr[0]);
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]!=arr[i-1]) {
				ArrList.add(arr[i]);
			}
		}
		return ArrList;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int [] arr = new int[size];

		for(int i = 0; i<arr.length; i++) {
			arr[i]=s.nextInt();
		}
		RemoveConecElement(arr);
		System.out.println(RemoveConecElement(arr));
	}
}
