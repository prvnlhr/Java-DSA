package OOPS_1;

public class DynamicArray {

	private int data[];
	private int nextIndex;

	public DynamicArray() {
		data=new int[5];     //defining initial array size
		nextIndex=0;         //count of current array index
	}

	public void add(int elem) {     //adding elements to array
		if(nextIndex == data.length) {
			doubleCapacity();     //this will execute if array becomes full
		}
		data[nextIndex]=elem;
		nextIndex++;
	}

	private void doubleCapacity() {

		int [] temp=data;
		data=new int[2*temp.length]; //when array becomes full,
		                             //we moves all elements to new temp array and 
		                            //increase the size of array two times double
		for(int i=0; i<temp.length;i++) {
			data[i]=temp[i];
		}
	}

	public void print() {  //this prints the array elements
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
	}

	public int get(int i) {    //this function is to get array element at i index
		return data[i];
	}

	public void set(int i, int j) { //this function set a new value a array index i
		data[i]=j;
		
	}
}
