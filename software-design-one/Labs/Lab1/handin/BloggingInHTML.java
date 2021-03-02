import java.util.Scanner;

public class BloggingInHTML{
	
	public static void main(String[] args){
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		// set up inputs from user
		
		String heading = input.nextLine();
		
		String image= input.nextLine();
		
		String text = input.nextLine();
		
		String author = input.nextLine();
		
		String date = input.nextLine();
		
		//convert input to html
		
		String headingTag = "<h1>" + heading + "</h1>";
		
		String imageTag = "<img src='" + image + "' />";
		
		String textTag = "<p>" + text + "</p>";
		
		String smallTag = "<small>By " + author + ", " + date + "</small>";
		
		String outputTag = "<html><body>" + headingTag + imageTag + textTag + smallTag + "</body></html>";
		
		//output 
		
		System.out.println(outputTag); 
		
		
	}
	
	
}