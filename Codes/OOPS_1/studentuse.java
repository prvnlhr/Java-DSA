package OOPS_1;

public class studentuse {
	
	//different class same package example
	
   public static void main(String[] args) {
	
	   student s1 = new student();
	   student s2 = new student();
	   
	   s1.name ="praveen";
	    s2.name ="Hemant";
	    
	    s1.rollno = 20;
	    s2.rollno = 30;
	    
	    
	    //rollno gives error because rollno is set at private 
		//and cant be acess outside the class
	    //rollno can be acess only if rollno would have been default or public
	   
}

}
