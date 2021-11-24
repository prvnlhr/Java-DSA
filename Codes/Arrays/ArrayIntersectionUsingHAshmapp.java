package Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;


public class ArrayIntersectionUsingHAshmapp {

	public static void intersections(int[] arr1, int[] arr2){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		HashSet<Integer> hs = new HashSet<>();
		int i;
		for( i=0;i<arr1.length;i++){

			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					hs.add(arr1[i]);
				}
			}
		}
		for (int no:hs){
			System.out.println(arr1[i]);
		}
	}

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		intersections(arr1, arr2);
	}
}



