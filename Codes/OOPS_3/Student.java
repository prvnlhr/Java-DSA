package OOPS_3;

public class Student {

	String name;
	int roll_no;



	public void setNameRoll(String name, int roll_no ) {

		this.name=name;
		this.roll_no=roll_no;
	}



	public void getName() {
             System.out.println(this.name);
	}
	public void getRoll() {
		System.out.println(this.roll_no);
	}

}
