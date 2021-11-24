package OOPS_1;

public class DynamicArrayUse {
	
   public static void main(String[] args) {
	   
	   DynamicArray d=new DynamicArray();
	   
		for(int i=1; i<100;i++) {      //adding elements to array
			d.add(100+i);
		}
		
		d.set(3,10); //setting element of array
		
		d.print();    //printing elements of array
	}
}
