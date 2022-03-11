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
	
	@SuppressWarnings("unchecked")
	public MinHeap() {
		capacity = START_SIZE;
		data = (T[]) new Object[START_SIZE];
	}
	
	
}
