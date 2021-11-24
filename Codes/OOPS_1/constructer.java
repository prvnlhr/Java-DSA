package OOPS_1;

public class constructer {
	
	    String name;
	    int rollno;
	    
	    public constructer(String name,int rollno) {
	    	this.name=name;
	    	this.rollno=rollno;
	    }
	    
	    public constructer(String name) {
	    	
	    	this.name=name;
	       } 
	    public constructer() {
	    	name="Hemant";
	    	rollno=20;
	    }
	    public void print() {
	    	System.out.println(name+" "+rollno);
	    }
	    }