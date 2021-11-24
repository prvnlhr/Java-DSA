package OOPS_1;
//what we have to do is to take input of the degrees and coeff of 
//of the polynomial from the user. then we have to create two arrays,
//one stores the degrees and the other stores the coeff.
//once we are done storing degree and coeff, now what we have to do is to
//make a third array which will create a polynomial using the degree and coeff
//so basically we have to pass the degree and coeff to the polynomial function
//and it will put the coeff at a particular degree.
//so let say degree=2 which would be third element of the polynomial
//so we have to insert the coeff at degree 2 like array[degree]=coeff.
//we have to run the loop for every coeff and degree.

public class polynomial {

	int [] degCoff;

	//Constructor for automatically initializing array for creating polynomial 	
	public polynomial() {
		degCoff= new int[10];
	}

	//creating polynomial method
	public void setCoeff(int degree, int coeff){

		if(degree>degCoff.length-1) { 
			int [] temp=degCoff;
			degCoff=new int[degree+1];
			for(int i=0; i<temp.length;i++) {
				temp[i]=degCoff[i];
			}
		}
		degCoff[degree]=coeff;
	}

	//print method
	public void print() {
		for(int i=0; i<degCoff.length;i++) {		
			System.out.print(degCoff[i]);
		}
	}
}
