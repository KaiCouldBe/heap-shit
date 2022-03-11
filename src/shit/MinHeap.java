package shit;

public class MinHeap <T extends Comparable<T>> {

	// Runs off an array that will grow if needed.
	// Capacity is total size of array.
	private int capacity;
	// Size is number of items in heap
	private int size;
	// This is where the meat and potatoes are stored
	private T[] data;
	
	// Powers of two turn me on so we're doing that
	final int START_SIZE = 64;
	
	/**
	 * Start things out with empty heap
	 */
	@SuppressWarnings("unchecked")
	public MinHeap() {
		// Nothing in there so size is 0
		size = 0;
		// Capacity starts where we defined it to start
		capacity = START_SIZE;
		// aaaaaand we make ourselves a sexy ol array
		data = (T[]) new Comparable[capacity];
	}
	
	/**
	 * Add item to heap
	 * @param item Thing we wanna add to heap
	 */
	public void insert(T item) {
		// Append item to end of heap and percolate up
		data[size] = item;
		size++;
		percolateUp(size - 1);
	}
	
	/**
	 * Returns the minimum item in the heap (the root)
	 * @return minimum item in heap
	 */
	public T getMin() {
		return data[0];
	}
	
	public void cheat() {
		for(T i : data) {
			if(i != null) System.out.print(i.toString() + " ");
		}
		System.out.println();
	}

	/**
	 * Swap two items referenced by indices
	 * @param i Index of first thing we swap
	 * @param j Index of second thing we swap
	 * @return whether or not it worked
	 */
	private void swap(int i, int j) {
		T buffer = data[i];
		data[i] = data[j];
		data[j] = buffer;
	}
	
	/**
	 * Expands array if needed, doubling original capacity
	 */
	@SuppressWarnings("unchecked")
	private void expand() {
		// make new array of double size
		capacity *= 2;
		T[] nuevo = (T[]) new Comparable[capacity];
		// populate new array
		for(int i = 0; i < data.length; i++) nuevo[i] = data[i];
		// set data to new array
		data = nuevo;
	}
	
	/**
	 * Take item at index i of array and move it up the heap
	 * @param i Index of thing we're percolating up
	 */
	private boolean percolateUp(int i) {
		// there's no such element i or we can't percolate up 0
		if(i >= size || i == 0) return false;
		
		int parentIndex = (i - 1)/2;
		T thing = data[i];
		T parent = data[parentIndex];
		
		// If the item is greater than parent we're good. Otherwise, move up.
		while(thing.compareTo(parent) < 0) {
			// item is less than parent so swap
			swap(i, parentIndex);
			i = parentIndex;
			
			// If i is 0 then we've reached the root of the heap
			if(i <= 0) return true;
			// Otherwise get new parent and keep going
			else {
				parentIndex = (i - 1)/2;
				parent = data[parentIndex];
			}
		}
		
		return true;
	}
	
	/**
	 * Take item at index i and move it down the heap
	 * @param i
	 * @return whether or not it worked
	 */
	private boolean percolateDown(int i) {
		// if item doesn't exist then don't bother
		if(i >= size) return false;
		// If second child doesn't fit in array then we gotta expand first
		if((i * 2) + 2 >= capacity) expand();
		
		T thing = data[i];
		
		// left child
		T lhs = data[(i * 2)+1];
		// right child
		T rhs = data[(i * 2)+2];
		
		while()
		
		return true;
	}
}
