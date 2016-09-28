package GotchaGameTakeOnePackage;

public class MissionClass {
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getLocation() {
		return location;
	}
	public MissionClass(String playerName, String item, String target, String location) {
		super();
		this.playerName = playerName;
		this.item = item;
		this.target = target;
		this.location = location;
	}
	public MissionClass() {
		// TODO Auto-generated constructor stub
	}
	public void setLocation(String location) {
		this.location = location;
	}
	private String playerName;
	private String item;
	private String target;
	private String location;



public void printAssignment () 


{	System.out.println();
	System.out.println(playerName + "'s Mission!");
	System.out.println("------------------------------");
	System.out.println("The target is: " + target);
	System.out.println("The item is: " + item);
	System.out.println("The location is: " + location);
	System.out.println("------------------------------");
		System.out.println();
}

}
