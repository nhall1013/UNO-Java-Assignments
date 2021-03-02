
public class ArrayUtil{

	public static void reverse(String[] array){
		String[] temp = new String[array.length];
		int length = array.length-1; 
		for(int i=0; i<=length; i++){
			temp[length-1-i] = array[i];
		}
		for(int k=0; k<=length; k++){
			array[k] = temp[k];
		}
	}
	public static String[] resize(String[] array){
		String[] resize = new String[array.length*2];
		for(int i =0; i<=array.length-1; i++){
			resize[i] = array[i];
		}
		return resize;
	}
	public static String[] add(String element, String[] array){
		String[] add = new String[array.length*2];
		for(int i =0; i<array.length; i++){
		add[i] = array[i];
		if(i-1 < array.length)
			add[i+1] = element;
		}
		return add; 
	}
}