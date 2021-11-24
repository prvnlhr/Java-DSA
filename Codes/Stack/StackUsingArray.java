package Stack;

public class StackUsingArray {

	int data[];
	int topIndex;
	//--------------- Constructor ----------------------------------------------
	public StackUsingArray( ) {
		data = new int[10];
		topIndex =-1;
	}
	public StackUsingArray(int n ) { // user defined constructor
		data = new int[n];
		topIndex =-1;
	}
//-------------------- Push Function On(1)---------------------------------------------
	public void push(int elem) {

		if(topIndex == data.length-1) {
			doubleCapacity(); //if Array is full
		}
		data[++topIndex] = elem;
	}
// creating new  array of double size
	private void doubleCapacity() {
		int [] temp = data;
		data = new int [2*temp.length];
		for(int i = 0; i<temp.length; i++) { // copying elements to new array
			data[i] = temp[i];
		}
	}
//---------------------- top function On(1)--------------------------------------------
	public int top() throws StackEmptyException {
		if(topIndex == -1) {
			// if not element present throw Empty exception
			throw new StackEmptyException();
		}
		return data[topIndex];
	}
	//------------------------- Size function On(1)-------------------------------------------------
	public int size() {
		return topIndex+1;

	}
	//------------------------- Print Function-----------------------------------
	public void print() {
		int count = 0;
		while(count <= topIndex) {
			System.out.print(data[count]+" ");
			count++;
		}
		System.out.println();
	}
	//-------------------------- pop function On(1)----------------------------------------------------
	public int pop() throws StackEmptyException {
		if(topIndex == -1) {
			// if not element present throw Empty exception
			throw new StackEmptyException();
		}
		int temp = data[topIndex];
		topIndex --;
		return temp;
	}
	//---------------------------- Empty or Not On(1)-----------------------------------------------
	public boolean isEmpty() {
		if(topIndex == -1) {
			return true;
		}
		else {
			return false;
		}
	}
}

