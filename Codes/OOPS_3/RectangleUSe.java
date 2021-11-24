package OOPS_3;

public class RectangleUSe {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(4,5);
		Rectangle b = new Rectangle(5,8);
		
		System.out.println("Area : "+a.getArea()+" Perimeter is "+a.getPerimeter());
		System.out.println("Area : "+b.getArea()+" Perimeter is "+b.getPerimeter());
	}
}

