package Arrays;
import java.util.Scanner;

public class ArrayArrangement{


	public static int[] takeInput(int n) {

		int[] arr = new int[n];
		int num=1;
		int j=n-1;
		int i;
		for( i = 0;i < j;i++)
		{
			arr[i] = num;
			num++;
			arr[j]=num;
			num++;
			j--;
		}
		if(i==j) 
		{
			arr[i]=num;
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int n=s.nextInt();
		int[] arr = takeInput(n);

		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
}




