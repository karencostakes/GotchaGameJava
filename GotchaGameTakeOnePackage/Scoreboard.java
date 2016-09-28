package GotchaGameTakeOnePackage;

public class Scoreboard {
	
	
	
	public String getPlayerNameForScoreboard() {
		return playerNameForScoreboard;
	}

	public void setPlayerNameForScoreboard(String playerNameForScoreboard) {
		this.playerNameForScoreboard = playerNameForScoreboard;
	}

	public int getTargetsAcquired() {
		return targetsAcquired;
	}

	public void setTargetsAcquired(int targetsAcquired) {
		this.targetsAcquired = targetsAcquired;
	}

	private String playerNameForScoreboard;
	private int targetsAcquired;
	


public void printScoreBoard () 


{	System.out.println();
	System.out.println(playerNameForScoreboard + "'s Score");
	System.out.println("------------------------------");
	System.out.println("The number of target's acquired is: " + targetsAcquired);


		System.out.println();
}


}