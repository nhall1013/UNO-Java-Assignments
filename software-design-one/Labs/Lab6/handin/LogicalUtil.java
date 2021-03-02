public class LogicalUtil{
	
	public static boolean thereExists(boolean p, boolean q, boolean r){  
		if(p || q || r ){
			return true;
		}
			return false; 
	}
	public static boolean forAll(boolean p, boolean q, boolean r){
		boolean all = true;
		if(p == true && q == true && r == true){
		return all; 
		}
		else{
		all = false;
		return all; 
		}
	}
	public static boolean majority(boolean p, boolean q, boolean r){
		boolean majority = true; 
		if(p == true && q == true){
			return majority;
		}
		else if(p == true && r == true){
			return majority; 
		}
		else if (q == true && r == true){
			return majority;
		}
		else {
			majority = false;
			return majority; 
		}
	}
	public static boolean minority(boolean p, boolean q, boolean r){
		boolean minority = false;
		if(p == false && q == false){
			return minority;
		}
		else if(p == false && r == false){
			return minority; 
		}
		else if(q == false && r == false){
			return minority; 
		}
		else{
			minority = true;
			return minority;
		}
	}
	public static boolean implies(boolean p, boolean q){
		boolean implies = true; 
		if(p == true && q == false){
			implies = false; 
			return implies;
		}
		else{
			return implies;
		}
	}
	public static boolean implies(boolean p, boolean q, boolean r){
		boolean implies = true; 
		if(p == true && q == true && r == false){
			implies = false;
			return implies;
		}
		else{
			return implies;
		}
	}
}