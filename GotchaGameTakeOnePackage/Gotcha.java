package GotchaGameTakeOnePackage;

public class Gotcha {
	
private String playerWhoGotGotcha;
public String getPlayerWhoGotGotcha() {
	return playerWhoGotGotcha;
}
public void setPlayerWhoGotGotcha(String playerWhoGotGotcha) {
	this.playerWhoGotGotcha = playerWhoGotGotcha;
}
public String getPlayerWhoGotGot() {
	return playerWhoGotGot;
}
public Gotcha(String playerWhoGotGotcha, String playerWhoGotGot) {
	super();
	this.playerWhoGotGotcha = playerWhoGotGotcha;
	this.playerWhoGotGot = playerWhoGotGot;
}
public Gotcha() {
	// TODO Auto-generated constructor stub
}

public void setPlayerWhoGotGot(String playerWhoGotGot) {
	this.playerWhoGotGot = playerWhoGotGot;
}
private String playerWhoGotGot;




public void printGotcha() 


{	System.out.println();
	System.out.println("A Gotcha Occured!");
	System.out.println("------------------------------");
	System.out.println("The player who took out a target is: " + playerWhoGotGotcha);
	System.out.println("The target who got got is: " + playerWhoGotGot);
	System.out.println(playerWhoGotGot + " has been removed from the game.");
	System.out.println("Stay tuned for your new assignments!");
	System.out.println("------------------------------");
		System.out.println();
}



}