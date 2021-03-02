import java.util.List;
import java.lang.Comparable;
public class Sorters2120 {

    public static <T extends Comparable<T> > void bubbleSort(List<T> theList) {
        int lastToConsider = theList.size();
        while (lastToConsider > 1) {
            for (int j=0; j<lastToConsider-1; j++) {
                if (theList.get(j).compareTo(theList.get(j+1))  >  0 ) {
                    swap(theList,j,j+1);
                }
            }
            lastToConsider--;
        }
    }

    private static <T extends Comparable<T> > void swap(List<T> theList, int i1, int i2) {

        T temp = theList.get(i1);
        theList.set(i1,theList.get(i2));
        theList.set(i2,temp);
    }
    /**
     * A method that sorts generic lists by using the selection sort algorithm.
     * 
     * @param theList - generic list
     */
    public static <T extends Comparable<T> > void selectionSort(List<T> theList) {
        int last = theList.size();
        for(int i=0; i<last-1; i++){
            int min = i;
            for(int index=i+1; index<last; index++){
                if(theList.get(index).compareTo(theList.get(min)) < 0){
                     min = index;
                }
                
            }
            swap(theList,i,min);
        }

    }

    public static <T extends Comparable<T> > void mergeSort(List<T> theList) {
        recursiveMergeSortHelper(theList,0,theList.size()-1);
    }


    /**
     * A method that recursively sorts a generic list and by implementing the merge sort algorithm.
     *  
     * @param theList - generic list
     * @param first - first index of list
     * @param last - last index of list
     */
    
    private static <T extends Comparable<T> > void recursiveMergeSortHelper(List<T> theList, int first, int last) {
        //if((theList.get(last).compareTo(theList.get(first))) >= 1)
        if(first<last){
            int middle1 = (first+last) / 2;
            int middle2 = middle1 + 1;

            recursiveMergeSortHelper(theList,first,middle1);
            recursiveMergeSortHelper(theList,middle2,last);
            merge(theList,first,middle2,last);
        }
    }

    
    /**
     * A method that merges the two different lists that are used for the merge sort algorithm. 
     * 
     * @param theList - generic list
     * @param left - left index
     * @param middle1 - middle index of first list
     * @param middle2 - mddle index of second list
     * @param right - right index 
     */
    private static <T extends Comparable<T>> void merge(List<T> theList, int left,int middle2, int right){
        int leftIndex = left;
        int rightIndex = middle2;

        while(leftIndex<middle2 && rightIndex<=right){
            if(theList.get(leftIndex).compareTo(theList.get(rightIndex))<=0){
                leftIndex++;
            }else{
                theList.add(leftIndex,theList.get(rightIndex));
                theList.remove(rightIndex+1);

                leftIndex++;
                middle2++;
                rightIndex++;
            }
        }
    }

    public static <T extends Comparable<T> > int indexOf(T searchItem, List<T> theList) {

        return recursiveBinarySearcher(searchItem, theList, 0, theList.size()-1);

    }


    /**
     * A method that recursively searches for an element in a generic list using the binary search algorithm. 
     * 
     * @param searchItem - element being searched for
     * @param theList - generic list
     * @param first - first index
     * @param last - last index
     * @return - returns an integer value reperesenting the index that the element was found out. If the element
     *           was not found the method returns -1
     */
    private static <T extends Comparable<T> > int recursiveBinarySearcher(T searchItem, List<T> theList, int first, int last) {
        int middle = (first+last) / 2;
        
        if(first<=last){
            
            if(theList.get(middle).compareTo(searchItem) == 0)
                return middle;
          
           else if(theList.get(middle).compareTo(searchItem) > 0)
                return recursiveBinarySearcher(searchItem, theList, first, middle-1); 
            else
                return recursiveBinarySearcher(searchItem, theList, middle+1,last); 
                
        }
        return -1;
          

    }
}
