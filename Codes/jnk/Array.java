package jnk;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		 int iarr[]=new int[10];
		 double darr[]=new double[10];
		 char Carr[]=new char[10];
		 boolean barr[] = new boolean[5];
		 iarr[9]=23;
		 System.out.println(iarr[9]); 
		 System.out.println(Carr[7]); //for char arr default value is null
		 System.out.println(iarr[2]);  //by default array has value zero stored so for index 2 it will print 0
		 System.out.println(darr[3]); //for double default value is 0.0
		 System.out.println(barr[1]); //bollean arr by default stores false values
	}

}
