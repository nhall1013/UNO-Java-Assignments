public class StringUtil{

	public static String toString(double data){
		String result = "\"" + Double.toString(data) + "\"";
		return result;
	}
	public static String toString(float data){
		String result = "\"" + Float.toString(data) + "\"";
		return result;
	}
	public static String toString(int data){
		String result = "\"" + Integer.toString(data) + "\"";
		return result; 
	}
	public static String toString(long data){
		String result = "\"" + Long.toString(data) + "\"";
		return result;
	}
	public static String toString(char data){
		String result = "\"" + data + "\"";
		return result;
	}
	public static String toString (boolean data){
		String result = "\"" + data + "\"";
		return result; 
	}
}