package OOPS_1;

public class classT {
	
        int a; 
        int b; 

    public void set(int a, int b) 
    {  
        b = a; 
        this.b = b; 
    } 

    void display() 
    { 
        System.out.println("a=" + a + " b=" + b); 
    } 


    public static void main(String[] args) 
    { 
        classT object = new classT();
        object.set(10,20);
        object.display(); 
    } 
 
}
