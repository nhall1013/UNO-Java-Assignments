public class CeaserCypher{

	public static String encrypt(String message, int shift){
		char[] chars = message.toCharArray();
		String encrypt = "";
		for(char c : chars){
			encrypt += (char)(c+shift);
		}
		return encrypt; 
	}
	public static String decrypt(String message, int shift){
		char[] chars = message.toCharArray();
		String decrypt = "";
		for(char c : chars){
			decrypt += (char)(c-shift);
		}
		return decrypt; 
	}
}