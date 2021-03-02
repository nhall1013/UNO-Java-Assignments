public class TestRunner{


	public static void main(String[] args) throws InterruptedException,UnderflowException{
		TestBuildHeap buildHeapTest = new TestBuildHeap();
		TestInsert insertTest = new TestInsert();
		
		System.out.println();
		System.out.println("Testing buildHeap() with sorted input:");
		System.out.println();
		System.out.println("Range of 40,000-90,000");	
			System.out.println();
			buildHeapTest.sorted(40000);
			buildHeapTest.sorted(50000);
			buildHeapTest.sorted(60000);
			buildHeapTest.sorted(70000);
			buildHeapTest.sorted(80000);
			buildHeapTest.sorted(90000);
			System.out.println();
			
		System.out.println("Range of 500,000-1,000,000");
			System.out.println();		
			buildHeapTest.sorted(500000);
			buildHeapTest.sorted(600000);
			buildHeapTest.sorted(700000);
			buildHeapTest.sorted(800000);
			buildHeapTest.sorted(900000);
			buildHeapTest.sorted(1000000);
			System.out.println();
		System.out.println("Range of 3,000,000-10,000,000");
			System.out.println();
			buildHeapTest.sorted(3000000);
			buildHeapTest.sorted(4000000);
			buildHeapTest.sorted(5000000);
			buildHeapTest.sorted(6000000);
			buildHeapTest.sorted(7000000);
			buildHeapTest.sorted(8000000);
			buildHeapTest.sorted(9000000);
			buildHeapTest.sorted(10000000);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Testing buildHeap() with reversed input:");
		System.out.println();
		System.out.println("Range of 40,000-90,000");
			System.out.println();
			buildHeapTest.reverse(40000);
			buildHeapTest.reverse(50000);
			buildHeapTest.reverse(60000);
			buildHeapTest.reverse(70000);
			buildHeapTest.reverse(80000);
			buildHeapTest.reverse(90000);
			System.out.println();
		System.out.println("Range of 500,000-1,000,000");
			System.out.println();
			buildHeapTest.reverse(500000);
			buildHeapTest.reverse(600000);
			buildHeapTest.reverse(700000);
			buildHeapTest.reverse(800000);
			buildHeapTest.reverse(900000);
			buildHeapTest.reverse(1000000);
			System.out.println();
		System.out.println("Range of 3,000,000-10,000,000");
			System.out.println();
			buildHeapTest.reverse(3000000);
			buildHeapTest.reverse(4000000);
			buildHeapTest.reverse(5000000);
			buildHeapTest.reverse(6000000);
			buildHeapTest.reverse(7000000);
			buildHeapTest.reverse(8000000);
			buildHeapTest.reverse(9000000);
			buildHeapTest.reverse(10000000);
			
		System.out.println();
		System.out.println();
		
		System.out.println("Testing buildHeap() with random input:");
		System.out.println();
		System.out.println("Range of 40,000-90,000");
			System.out.println();
			buildHeapTest.random(40000);
			buildHeapTest.random(50000);
			buildHeapTest.random(60000);
			buildHeapTest.random(70000);
			buildHeapTest.random(80000);
			buildHeapTest.random(90000);
			System.out.println();
		System.out.println("Range of 500,000-1,000,000");
			System.out.println();
			buildHeapTest.random(500000);
			buildHeapTest.random(600000);
			buildHeapTest.random(700000);
			buildHeapTest.random(800000);
			buildHeapTest.random(900000);
			buildHeapTest.random(1000000);
			System.out.println();
		System.out.println("Range of 3,000,000-10,000,000");
			System.out.println();
			buildHeapTest.random(3000000);
			buildHeapTest.random(4000000);
			buildHeapTest.random(5000000);
			buildHeapTest.random(6000000);
			buildHeapTest.random(7000000);
			buildHeapTest.random(8000000);
			buildHeapTest.random(9000000);
			buildHeapTest.random(10000000);
			
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("Testing insert() with sorted input:");
		System.out.println();
		System.out.println("Range of 40,000-90,000");	
			System.out.println();
			insertTest.sorted(40000);
			insertTest.sorted(50000);
			insertTest.sorted(60000);
			insertTest.sorted(70000);
			insertTest.sorted(80000);
			insertTest.sorted(90000);
			System.out.println();
		System.out.println("Range of 500,000-1,000,000");
			System.out.println();		
			insertTest.sorted(500000);
			insertTest.sorted(600000);
			insertTest.sorted(700000);
			insertTest.sorted(800000);
			insertTest.sorted(900000);
			insertTest.sorted(1000000);
			System.out.println();
		System.out.println("Range of 3,000,000-10,000,000");
			System.out.println();
			insertTest.sorted(3000000);
			insertTest.sorted(4000000);
			insertTest.sorted(5000000);
			insertTest.sorted(6000000);
			insertTest.sorted(7000000);
			insertTest.sorted(8000000);
			insertTest.sorted(9000000);
			insertTest.sorted(10000000);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Testing insert() with reversed input:");
		System.out.println();
		System.out.println("Range of 40,000-90,000");
			System.out.println();
			insertTest.reverse(40000);
			insertTest.reverse(50000);
			insertTest.reverse(60000);
			insertTest.reverse(70000);
			insertTest.reverse(80000);
			insertTest.reverse(90000);
			System.out.println();
		System.out.println("Range of 500,000-1,000,000");
			System.out.println();
			insertTest.reverse(500000);
			insertTest.reverse(600000);
			insertTest.reverse(700000);
			insertTest.reverse(800000);
			insertTest.reverse(900000);
			insertTest.reverse(1000000);
			System.out.println();
		System.out.println("Range of 3,000,000-10,000,000");
			System.out.println();
			insertTest.reverse(3000000);
			insertTest.reverse(4000000);
			insertTest.reverse(5000000);
			insertTest.reverse(6000000);
			insertTest.reverse(7000000);
			insertTest.reverse(8000000);
			insertTest.reverse(9000000);
			insertTest.reverse(10000000);
			
		System.out.println();
		System.out.println();
		
		System.out.println("Testing insert() with random input:");
		System.out.println();
		System.out.println("Range of 40,000-90,000");
			System.out.println();
			insertTest.random(40000);
			insertTest.random(50000);
			insertTest.random(60000);
			insertTest.random(70000);
			insertTest.random(80000);
			insertTest.random(90000);
			System.out.println();
		System.out.println("Range of 500,000-1,000,000");
			System.out.println();
			insertTest.random(500000);
			insertTest.random(600000);
			insertTest.random(700000);
			insertTest.random(800000);
			insertTest.random(900000);
			insertTest.random(1000000);
			System.out.println();
		System.out.println("Range of 3,000,000-10,000,000");
			System.out.println();
			insertTest.random(3000000);
			insertTest.random(4000000);
			insertTest.random(5000000);
			insertTest.random(6000000);
			insertTest.random(7000000);
			insertTest.random(8000000);
			insertTest.random(9000000);
			insertTest.random(10000000);
			
	}
}