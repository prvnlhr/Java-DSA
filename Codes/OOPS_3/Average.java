package OOPS_3;

public class Average {
	
	double Average;

	public double Calculate(int a, int b, int c) {
		
		Average =(a+b+c)/3;
		return Average;
	}

	public void print() {
		System.out.println(Average);
		
	}

}
