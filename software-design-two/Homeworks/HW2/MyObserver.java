/**

 @author Nick Hall
 
 A class can implement the MyObserver interface when it wants to be informed of changes in observable objects.

*/

public interface MyObserver{

/**

 This method is called whenever the observed object is changed. 
 An application calls a MyObservable object's notifyObservers method to 
 have all the object's observers notified of the change.
 

 @param o the observable object.
 @param obj an argument passed to the notifyObservers method.

*/

	public void update(MyObservable o, Object obj);

}