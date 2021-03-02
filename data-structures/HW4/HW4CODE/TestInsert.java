import java.util.*;


public class TestInsert{
	

	public void sorted(int n){
		BinaryHeap<Integer> insertSortedHeap = new BinaryHeap<>();

		long start = System.nanoTime();
		for(int i=0; i<n; i++){
			insertSortedHeap.insert(i);
		}
		long end = System.nanoTime();
		long msElapsed = (end - start) / 1000000;
		System.out.println("Execution time in milliseconds: " + msElapsed);
	}
	
	public void reverse(int n){
		BinaryHeap<Integer> insertReverseHeap = new BinaryHeap<>();
		int y = n;
		
		long start = System.nanoTime();
		for(int i=0; i<n; i++){
			insertReverseHeap.insert(y--);
		}
		long end = System.nanoTime();
		long msElapsed = (end - start) / 1000000;
		System.out.println("Execution time in milliseconds: " + msElapsed);
	}
	
	public void random(int n){
		Random random = new Random();
		BinaryHeap<Integer> insertRandomHeap = new BinaryHeap<>();
		
		long start = System.nanoTime();
		for(int i=0; i<n; i++){
			insertRandomHeap.insert(random.nextInt(n));
		}
		long end = System.nanoTime();
		long msElapsed = (end - start) / 1000000;
		System.out.println("Execution time in milliseconds: " + msElapsed);
	} 
}