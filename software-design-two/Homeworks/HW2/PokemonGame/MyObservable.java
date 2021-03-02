import java.util.Arrays;

/**

 @author Nick Hall 
 
 This class represents an observable object. 
 It can be subclassed to represent an object that the application wants to have observed. 


*/

public abstract class MyObservable{

	protected boolean changed = false;
	MyObserver[] observers = new MyObserver[0];
	
	
/**

 Adds an observer to the set of observers for this object
 
 @param o an observer that is added 

*/
	
	
	public void addObserver(MyObserver o){
		//observers.add(o);
		MyObserver[] temp = new MyObserver[observers.length+1];
		temp = Arrays.copyOf(observers,temp.length);
		temp[temp.length-1] = o;
		observers = temp;
	}
	
/**	
	
 Indicates that this object has no longer changed or that it has already notified 
 all of its observers of the most recent changes. 
	
	
*/	
	protected void clearChanged(){
		changed = false; 
	}
	
/**	
	
 Returns the number of observers 
 @return number of observers 	
	
*/	
	public int countObservers(){
		return observers.length;		
	}
	
/**

 Checks if the object has changed 
 @return true if the observer has changed. False otherwise. 

*/	
	
	public boolean hasChanged(){
		return changed;
	}
	
/**	
	
 Marks the observable object as having been changed 

*/	
	protected void setChanged(){
		changed = true; 
	}	
	
	
	
	
	public void notifyObservers(){
		notifyObservers(null);	
	}
	
/**	
	
 If this object has changed then notify all of its observers 
 and then call the clearChanged method to indicate that this object has no longer changed.
 
 @param arg any object 

*/	
	public void notifyObservers(Object arg) {
		if(hasChanged()){
			for(MyObserver a : observers){
				a.update(this, arg);
				setChanged();
			}
			clearChanged();
		}
	}
}