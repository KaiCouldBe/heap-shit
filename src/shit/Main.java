package shit;

public class Main {

	public static void main(String[] args) {
		MinHeap<Integer> foo = new MinHeap<Integer>();
		
		// for(int i = 0; i < 16; i++) foo.insert(i);
		for(int i = 15; i >= 0; i--) foo.insert(i);
		
		foo.cheat();
	}
}
