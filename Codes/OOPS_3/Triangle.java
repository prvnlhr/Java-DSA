package OOPS_3;

public class Triangle {

	//USING CONSTUCTOR
	int a, b , c;

	public Triangle(int side1, int side2, int side3) {

		this.a = side1;
		this.b = side2;
		this.c = side3;
	}
//Area function
	public double Area() {
		int s=a+b+c;
		double Area= Math.pow(s*(s-a)*(s-b)*(s-c), 0.5);
		return Area;
	}
//Perimeter function
	public int Perimeter() {
		int Perimeter = a+b+c;
		return Perimeter;
	}
}

//WITHOUT USING CONTRUCTER

//	int a,b,c;
//
//	double Area;
//	int Perimeter;
//
//	public double getArea() {
//		int s=a+b+c;
//		Area= Math.pow(s*(s-a)*(s-b)*(s-c), 0.5);
//		return Area;
//	}
//
//	public  int getPerimeter() {
//		Perimeter=a+b+c;
//		return Perimeter;   
//
//	}
//}
