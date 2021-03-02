public class House{
	
	Room library;
	Room southhall;
	Room dining;
	Room kitchen;
	Room northhall;
	Room bedroom;
	Room porch;
	
	public House(){
		library = new Room("You are in the library.");
		southhall = new Room("You are in the south hall.");
		dining = new Room("You are in the dining room.");
		kitchen = new Room("You are in the kitchen.");
		northhall= new Room("You are in the north hall.");
		bedroom = new Room("You are in the bedroom.");
		porch = new Room("You are on the porch.");
		library.setExits(bedroom, null, southhall, null); 
		southhall.setExits(northhall, null, dining, library);
		dining.setExits(kitchen, null, null, southhall);
		kitchen.setExits(null, dining, null, northhall);
		northhall.setExits(porch, southhall, kitchen, bedroom);
		bedroom.setExits(null, library, northhall, null);
		porch.setExits(null, northhall, null, null);
	}
	
	public Room start(){
		return library; 
	}
}