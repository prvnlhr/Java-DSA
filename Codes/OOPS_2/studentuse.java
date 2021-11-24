package OOPS_2;

import ClassAndObject.student;  //this is import statement because 
                                //we are importing from different package
   
public class studentuse {
	//different package and different class example
	
   public static void main(String[] args) {
		
		student s1 = new student();
		student s2 = new student();
		
		
		s1.name = "Praveen";
		s1.rollno = 20;
		
		
	  //rollno we give error if rollno is default or private in student class
	  //but if public then no error
		//rollno can only be acess if rollno would have been public
		
		
	}
}
