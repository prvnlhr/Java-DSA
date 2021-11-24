package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int disks = s.nextInt();
		towerOfHanoi(disks , 'a', 'b' ,'c');
		
	}

	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		 
		if(disks==1) {
			System.out.println('a'+" "+'c');
			return;
		}
		else {
		 towerOfHanoi(disks-1, source,auxiliary, destination);
	 	System.out.println(source +" "+ destination);
	 	towerOfHanoi(disks-1, auxiliary, destination,source);
	}
	}
}


