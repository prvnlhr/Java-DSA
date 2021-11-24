package Queue;

public class QueueUsingArray {

	int [] data;
	int front;
	int rear ;
	int size ;
//------------------------------Constructor
	public QueueUsingArray() {     

		data = new int [5];
		front = -1;
		rear = -1;
		size = 0;
	}
//-------------------------------Print
	public void print() {
		for(int i=0 ;i<size; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
//------------------------------Enqueue // O(1)
	
	public void enqueue(int elem) {
		if(size == data.length) {
			doubleCapacity();
		}
		if(size ==0) {
			front = 0;                      
		}
		rear++;
		data[rear]= elem;
		size++;
	}
 private void doubleCapacity() {
	 int [] temp = data;
	  data = new int [2*temp.length];
	    int index = 0;
	  for(int i = front ; i<temp.length ;i++) {
		  data[index++] = temp[i];
		 }
	  for(int i = 0; i< front ;i++) {
		  data[index++]= temp[i];
	  }
	  front = 0;
	  rear = temp.length-1;
       }
//-------------------------------Dequeue // O(1)
	
	public int dequeue() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}

		int temp = data[front];
		front++;
		if(front ==data.length) {
			front = 0;
		}
		size--;
		if(size==0) {
			front =-1;
			rear = -1;
		}
		return temp;
	}
//--------------------------------Size // O(1)
	
	public int size() {
		return size;
	}
//--------------------------------Front // O(1)
	
	public int front() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		return data[front];
	}
//---------------------------------Empty or Not // O(1)
	
	public boolean isEmpty() {
		return size==0;
	}
}
