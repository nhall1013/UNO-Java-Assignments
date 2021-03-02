import java.util.ArrayList;

//generic stack using ArrayList implementation
public class Stack<T>{
    
    private ArrayList<T> stackList;

    public Stack(){
        this.stackList = new ArrayList<T>();
    }

    //adds element to the stack
    public void push(T element){
        stackList.add(element);
    }

    //removes an element from the stack
    public T pop(){
        return stackList.remove(stackList.size()-1);
    }

    //checks to see if the stack is empty
    public boolean isEmpty(){
        return stackList.isEmpty();
    }

    //looks to see whats in the end of the stack but does not remove the item
    public T peek() {
        return stackList.get(stackList.size()-1);
    }

    //gets size of the stack 
    public int getSize(){
	    return this.stackList.size();
    }
    
    //clears all elements from the stack
    public void clear(){
        stackList.clear();
    }
}
