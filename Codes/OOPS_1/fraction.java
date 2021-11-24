package OOPS_1;

public class fraction {

	int numerator;
	int denominator;

    //object call to class
	public fraction(int numerator ,int denominator) {

		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}

	 //simplifying fraction function
	public void simplify() {

		int gcd=1;
		int smaller=Math.min(numerator, denominator);

		for(int i=2; i<=smaller;i++) {
			if( numerator % i == 0 && denominator % i == 0) {
				gcd=i;
			}
		}
		this.numerator = numerator/gcd;
		this.denominator = denominator/gcd;
	}

	//increment function
	//	public void increment() {         
	//
	//		numerator=numerator+denominator;
	//		denominator=denominator;
	//		simplify();
	//	}



	//method1 for adding fraction
	//	public void add(fraction f2) {  
	//
	//	    this.numerator=this.numerator*f2.denominator+this.denominator*f2.numerator;
	//		this.denominator=this.denominator*f2.denominator;
	//	}



	// method2 for adding fraction
	public static fraction add(fraction f1, fraction f2) { 

		int newNum=f1.numerator*f2.denominator+f1.denominator*f2.numerator;
		int newDeno=f1.denominator*f2.denominator;
		fraction f3=new fraction(newNum,newDeno);
		return f3;
	}


	//printing function
	public void print() {             
		System.out.println(numerator+"/"+denominator);
	}
}

