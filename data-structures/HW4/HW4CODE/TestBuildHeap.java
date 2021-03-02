import java.util.*;



public class TestBuildHeap{
	
	public void sorted(int n){
		Integer[] sorted = new Integer[n];
		for(int i=0; i<sorted.length; i++){
			sorted[i] = i;
		}
		
		long start = System.nanoTime();
		BinaryHeap<Integer> sortedHeap = new BinaryHeap<>(sorted);
		long end = System.nanoTime();
		long msElapsed = (end - start) / 1000000;
		System.out.println("Execution time in milliseconds: " + msElapsed);
	}
	
	public void reverse(int n){
		Integer[] reverse = new Integer[n];
		int x = n;
		for(int i=0; i<reverse.length; i++){
			reverse[i] = x--;
		}
		
		long start = System.nanoTime();
		BinaryHeap<Integer> reverseHeap = new BinaryHeap<>(reverse);
		long end = System.nanoTime();
		long msElapsed = (end - start) / 1000000;
		System.out.println("Execution time in milliseconds: " + msElapsed);
	}
	
	public void random(int n){
		Integer[] rand = new Integer[n];
		Random random = new Random();
		for(int i=0; i<rand.length; i++){
			rand[i] = random.nextInt(n);
		}
		
		long start = System.nanoTime();
		BinaryHeap<Integer> randomHeap = new BinaryHeap<>(rand);
		long end = System.nanoTime();
		long msElapsed = (end - start) / 1000000;
		System.out.println("Execution time in milliseconds: " + msElapsed);
	}



}