package OOPS_3;

public class ComplexUse {
	
 public static void main(String[] args){
		   
	 Complex c = new Complex(4,5);
		    Complex d = new Complex(9,4);

            Complex e = Complex.add(c,d);
		    Complex f = Complex.diff(c,d);
		    Complex g = Complex.product(c,d);
		    e.printComplex();
		    f.printComplex();
		    g.printComplex();
		  }
		}

