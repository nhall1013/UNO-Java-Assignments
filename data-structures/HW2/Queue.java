import java.util.LinkedList;

//generic queue using LinkedList implementation  
public class Queue<T>{
 
  private LinkedList<T> queueList;
  
  public Queue(){
      this.queueList = new LinkedList<T>();
  }

  //add element to the queue
  public void enqueue(T element){
      queueList.add(element);
  }
  
  //removes element from the queue
  public T dequeue(){
      return queueList.remove(0);
	}
  
  //looks to see whats in the queue at an index but does not remove the item
  public T peek(int i){
      if(queueList.isEmpty()){
		    return null; 
	    }
		  else{
			  return queueList.get(i);
		  }
  }

  //looks to see whats in the entire queue but does not remove the item
  public T peek(){
      if(queueList.isEmpty()){
        return null; 
      }
      else{
        return queueList.get(0);
      }
  }
    
  //checks to see if the queue is empty
  public boolean isEmpty() {
      return queueList.isEmpty();
  }
  
  //gets the size of the queue
  public int size(){
      return queueList.size();
  }

  //clears the queue
  public void clear(){
      queueList.clear();
  }
  
  //equals method that checks if two queues are equal
  public boolean equals(Queue<T> a, Queue<T> b){
      if(a.size() != b.size()){
        return false;
      } else 
          for(int i = 0; i<a.size(); i++){
            if(a.peek(i) != b.peek(i)){
              return false;
            }
          }
  
      return true;
  }
}
  