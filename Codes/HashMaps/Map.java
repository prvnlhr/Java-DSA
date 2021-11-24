package HashMaps;

import java.util.ArrayList;

public class Map<k,v>{
	
	ArrayList<MapNode<k,v>> buckets;

	int count;
	int numBuckets;

	public Map() {
		// Initially creating ArrayList of size 20 , and inserting values as null.
		buckets = new ArrayList<>();
		numBuckets = 20;
		for(int i = 0; i<numBuckets ; i++) {
			buckets.add(null);
		}
	}
//----------------------------------------------------------------------------------------------
//-- Hash Function to get index for the key:
	private int getBucketIndex(k key) {
		int hc = key.hashCode();
		int index = hc % numBuckets;
		return index;
	}
//-- INSERT FUNCTION : Inserting the key and value to ArrayList index with LL Node -------------
	
	public void insert(k key , v value) {

		//Step 1: getting index of the key to be inserted:	form getBucketIndex Function.	
		int bucketIndex = getBucketIndex(key);

		// Step 2: creating Node head:		
		MapNode<k,v> head = buckets.get(bucketIndex);
		// if the element is already present in the bucket update its value;	
		while(head!= null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		// if not present get its index and make a newNode and attach to the front of LL.
		head = buckets.get(bucketIndex);
		MapNode<k,v>newNode = new MapNode<k,v>(key, value);
		newNode.next = head;
		buckets.set(bucketIndex, newNode);
		count++;
		double loadFactor = (1.0 * count)/numBuckets;
		if(loadFactor> 0.7) {
			reHash();
		}
		
	}
//-- REHASHING --------------------------------------------------------------------------------------

	public void reHash() {
		ArrayList<MapNode<k, v>> temp  = buckets;
		buckets = new ArrayList<>();
		for(int i  = 0 ; i< 2*numBuckets ; i++) {
			buckets.add(null);
		}
		count = 0;
		numBuckets = numBuckets*2;
		for(int i = 0 ; i<temp.size() ; i++) {
			MapNode<k, v> head = temp.get(i);
			while(head!= null) {
				k key = head.key;
				v value = head.value;
				insert(key, value);
				head = head.next;
			}
		}
	}
	public double loadFactor() {
		return (1.0 * count)/numBuckets;
	}
//-- SIZE FUNCTION ---------------------------------------------------------------------------------
	public int size() {
		return count;
	}
//-- GET KEY VALUE FUNCTION ------------------------------------------------------------------------
	public v getValue( k key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<k, v> head  = buckets.get(bucketIndex);
		while(head!= null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
//-- REMOVE KEY FUNCTION ---------------------------------------------------------------------------
		 
	public v removeKey( k key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<k, v> head = buckets.get(bucketIndex);
		MapNode<k, v> prev = null;
		while(head!=null) {
			if(head.key.equals(key)) {
				if(prev!=null) {
					prev.next = head.next;
				}
				else {
					buckets.set(bucketIndex, head.next);
				}
				count--;
				return head.value;
			}
			prev = head;
			head = head.next;
		}
		return null;
	}
}


