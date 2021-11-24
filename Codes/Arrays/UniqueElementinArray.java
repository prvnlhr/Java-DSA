package Arrays;
import java.util.Scanner;

public class UniqueElementinArray {

	public static int Unique(int [] arr) {

		for(int i=0;i<arr.length;i++){
			int j;
			for( j=0;j<arr.length;j++){
				if(i!=j) {
					if(arr[i]==arr[j]) {
						break;
					}
				}
			}
			if(j==arr.length) {
				return arr[i];
			}
		}
		return 0;
	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(Unique(arr));
	}
}



