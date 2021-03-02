public class Clock{
    //build stacks and queues to hold the balls
    private Stack<Integer> min = new Stack<Integer>();
    private Stack<Integer> fiveMin = new Stack<Integer>();
    private Stack<Integer> hour = new Stack<Integer>();
    private Queue<Integer> queue = new Queue();
    private Queue<Integer> clone = new Queue();
    Queue classObject = new Queue();
   	private int hours = 0; //hours variable to keep track of time 
    
    //loads balls onto queue and the clone
    public void loadQueue(int n){
        for(int i=0; i<n; i++){
            queue.enqueue(i);
          	clone.enqueue(i);
        }
    }

    
    //ball clock simulator 
    public void runClock(){
    	while(min.getSize() < 5){
            int a = queue.dequeue();
            min.push(a);
            if(min.getSize() == 5){
                int b = min.pop();
                fiveMin.push(b);
                while(min.getSize() > 0){
               	    queue.enqueue(min.pop());
           	    }
            }
            if(fiveMin.getSize() == 12){
                hour.push(fiveMin.pop());
                while(fiveMin.getSize() > 0){
                    queue.enqueue(fiveMin.pop());
               
                }
            }
  	        if(hour.getSize() == 12){
                int z = hour.pop();
                while(hour.getSize() > 0){
                    queue.enqueue(hour.pop());
                }
                queue.enqueue(z);
                hours += 12;
                //calling equals method from Queue class to compare queue and clone
                if(classObject.equals(queue,clone)){
    				System.out.println(queue.size() + " balls cycle after " + hours/24 + " days");
                    //clear Queues and set hour to 0 for next input
                    queue.clear(); 
                    clone.clear();
                    hours = 0;
                    return;
    		    }
            }
        }
    }
}
