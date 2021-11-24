package OOPS_1;

public class ComplexNumbers {

	int real;
	int imaginary;
 
	public ComplexNumbers(int real, int imaginary) {

	this.real=real;
	this.imaginary=imaginary;
	}

	public void plus(ComplexNumbers c2) {

		int real=this.real + c2.real;
		int imaginary=this.imaginary+c2.imaginary;
		real=this.real;
		imaginary=this.imaginary;
	}

    public void multiply(ComplexNumbers c2) {
	int real=(this.real*c2.real)-(this.imaginary*c2.imaginary);
	int imaginary=(this.real*c2.imaginary)+(this.imaginary*c2.real);
	this.real=real;
	this.imaginary=imaginary;
	}
	
    public void print() {
		System.out.println(real+"+i"+imaginary);
	}
}
