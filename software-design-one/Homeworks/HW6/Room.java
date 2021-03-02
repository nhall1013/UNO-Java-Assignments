public class Room{
	//class fields
	private String description;
	private Room north;
	private Room south;
	private Room east;
	private Room west; 
	
	public Room(String desc){ //constructor
		description = desc; 
	} //end constructor
	
	//getter and setter methods
	public void setNorth(Room north){
		this.north = north; 
	}
	public void setSouth(Room south){
		this.south = south;
	}
	public void setEast(Room east){
		this.east = east; 
	}
	public void setWest(Room west){
		this.west = west; 
	}
	public void setExits(Room north, Room south, Room east, Room west){
		this.north = north;
		this.south = south;
		this.east = east;
		this.west = west;
	}
	public Room getNorth(){
		return this.north;
	}
	public Room getSouth(){
		return this.south; 
	}
	public Room getEast(){
		return this.east;
	}
	public Room getWest(){
		return this.west;
	}
	public String getDescription(){
		return this.description; 
	}
	public String getExits(){
		String exit = "Your exits are "; 
		if(north != null){
			exit += "North ";
		}
		if(south != null){
			exit += "South ";
		}
		if(east != null){
			exit += "East ";
		}
		if(west != null){
			exit += "West ";
		} 
		return exit; 
	}
	@Override
	public String toString(){
		return description + " " + getExits(); 
	}
}
	
	
	
	
	

	