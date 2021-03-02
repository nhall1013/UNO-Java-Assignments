public class ConversationGroups{
	
	public static void main(String[] args){
		
		//attributes
		int counter = 0; //initialize int counter to 0 
		//logic
		for(int personOne = 1; personOne <= 100-3; personOne++){ //for loop that starts at 1, ends at 100-3 
			for(int personTwo = personOne + 1; personTwo <= 100 - 2; personTwo++) //for loop that starts at personOne+1, ends at 100-2
				for(int personThree = personTwo + 1; personThree <= 100 - 1; personThree++) //for loop that starts at personTwo+1, ends at 100-1
					for(int personFour = personThree + 1 ; personFour <= 100; personFour++)//for loop that starts at personThree+1, ends at 100 
						counter += 1; //increment counter
		} //end for loop 
		System.out.println(counter); //output result
	}//end main
}//end class