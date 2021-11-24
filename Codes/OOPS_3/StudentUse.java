package OOPS_3;

import java.util.Scanner;

public class StudentUse {

	public static void main(String[] args) {

//		Scanner s=new Scanner(System.in);


//		String name=s.next();
//		int roll=s.nextInt();

		Student s1 = new Student();
		s1.name="Praveen";
		s1.roll_no=20;
		s1.setNameRoll("Praveen",20);

//		String name1=s.next();
//		int roll1=s.nextInt();

		Student s2 = new Student();     
		s2.name="Hemant";
		s2.roll_no=10;
		s2.setNameRoll("Hemant",10);

		s1.getName();
		s2.getRoll();
		s2.getRoll();
		
	}
}
