package OOPS_1;

public class studentuseGetSetConcept {

	public static void main(String[] args) {
		
		//getters and setters concept to acess private member
		
	//creating object
		
    student s1=new student();
	student s2=new student();
	
	s1.name="Praveen";
	s2.name="Hemant";
	
	//now as rollno is private we cant acess
	//but if want to acess rollno we will use get and set function
	//basically it is like creating function to call value except that function has name like get and set
	
	//setRollno function will be called..
	s1.setRollno(100);

	
	//here getRollno function will be called
	System.out.println(s1.name+" "+s1.getRollno());
	
	//using set and get we can acess private member and also 
	//make restriction in setting value
	
	
		
	}
}
