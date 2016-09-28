package GotchaGameTakeOnePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GotchaGameTakeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan1 = new Scanner(System.in);

		ArrayList<String> playerNamesAtStart = new ArrayList<>();
		// I am adding in the players for now, but eventually we want userInput
		// to do this.
		playerNamesAtStart.add("Kamel");
		playerNamesAtStart.add("Antonella");
		playerNamesAtStart.add("Shruti");
		playerNamesAtStart.add("Blair");
		playerNamesAtStart.add("Karen");

		ArrayList<String> playersLeftInGame = new ArrayList<>(playerNamesAtStart);

		ArrayList<String> locations = new ArrayList<>();

		ArrayList<String> items = new ArrayList<>();

		ArrayList<String> scoreboard = new ArrayList<>();

		ArrayList<MissionClass> playersMissionPerRound = new ArrayList<>();

		String gotcha = "no";

		MissionClass playerMission = new MissionClass();

		// set the missions for each player. We will continue to do this
		// everytime there is a gotcha until there is only one player left.
		// When there is only one player left,we have a winner!

		System.out.println("Welcome to Gotcha!");  
		System.out.println();
		System.out.println("Game Overview");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Each player will be given a mission.");  
		System.out.println();
		System.out.println("The mission will contain: ");
		System.out.println("1. a target (the target is another player)"); 
		System.out.println("2. a location"); 
		System.out.println("3. an item");
		System.out.println();
		System.out.println("To complete his/her mission, a player must:");
		System.out.println("1. Get his/her target to the specified location");
		System.out.println("2. Get his/her target to hold the specified item at the specified location."); 
		System.out.println();
		System.out.println("If a player is successful in their mission, a gotcha occurred.");  
		System.out.println("When a Gotcha occurs, the target player will be removed from the game.");
		System.out.println("All of the remaining players will be given new missions.");
		System.out.println("The last player standing wins.");
		System.out.println("Drumroll please...");

		while (playersLeftInGame.size()> 1) {

			locations.add("Grand Circus Lobby");

			locations.add("Ashe Coffee Shop");

			locations.add("3rd Floor");

			locations.add("2nd Floor");

			locations.add("Tiger Stadium");

			locations.add("Inside a classroom");

			items.add("Water Bottle");

			items.add("Notebook");

			items.add("Java book");

			items.add("Computer Cord");

			items.add("Umbrella");

			items.add("Pineapple");

			ArrayList<String> targets = new ArrayList<>(playersLeftInGame);

			for (int i = 0; i < playersLeftInGame.size(); i++) {

				// go through the arraylist of players
				playerMission.setPlayerName(playersLeftInGame.get(i));

				// We are going to shuffle the targets, locations, and items so
				// that they are in random order
				Collections.shuffle(targets);

				Collections.shuffle(locations);

				Collections.shuffle(items);

				// we will get the first item in the arraylist (because we later
				// remove the item used so it is not reused and the arraylist
				// shrinks, we cannot use i)
				playerMission.setItem(items.get(0));
				playerMission.setLocation(locations.get(0));
				playerMission.setTarget(targets.get(0));

				// a player cannot have him or her self as a target. If this
				// happens, we will go into a while loop until player and target
				// are not equal.
				// what about players with the same name? I think we will need a
				// unique identifier?  
				
				//I am taking out this while loop for now because I think it is buggy.  When it is in, sometimes the gotcha doesn't come up
			
				/*	while (playerMission.getTarget().equals(playersLeftInGame.get(i))) {

					Collections.shuffle(targets);
					playerMission.setTarget(targets.get(0));

				}*/

				items.remove(0);

				locations.remove(0);

				targets.remove(0);

				playerMission.printAssignment();

				// Add each player to the arrayList of PlayerMissions. We will
				// need this for the Gotcha portion of the game to identify
				// target of player who got gotcha
				playersMissionPerRound.add(playerMission);

				// after an item has been used for a player's mission, we don't
				// want it to be reused, so we take it out of the ArrayList

			}

			System.out.println("Was there a gotcha?");
			gotcha = scan1.nextLine();
			Gotcha gotchaOccurred = new Gotcha();
			if (gotcha.equalsIgnoreCase("yes")) {
				System.out.println("Who got the gotcha?");
				gotchaOccurred.setPlayerWhoGotGotcha(scan1.nextLine());
				scoreboard.add(gotchaOccurred.getPlayerWhoGotGotcha());
				
				System.out.println("Who got got?");
				gotchaOccurred.setPlayerWhoGotGot(scan1.nextLine());
				System.out.println(playersMissionPerRound.size());
				gotchaOccurred.printGotcha();
				
			
				for (String removal : playersLeftInGame) {
					 if(gotchaOccurred.getPlayerWhoGotGot().equals(removal)) 
					 {
						 playersLeftInGame.remove(removal); 
						 System.out.println("This person will be removed from the game: " + removal);
					
					playersMissionPerRound.clear();
					gotcha = "no";
					break;
					
					
					 }
				}
				
			}
					
				if (playersLeftInGame.size() == 1)
				{
					Scoreboard endOfGameScoreboard = new Scoreboard ();
					 
					
					System.out.println();
					System.out.println("We have a winner!");
					System.out.println("The winner is..." + playersLeftInGame.get(0));
					 
				     for (int z=0; z< playerNamesAtStart.size(); z++)
				     {
				    	endOfGameScoreboard.setPlayerNameForScoreboard(playerNamesAtStart.get(z));
				    	 int sum = 0;
				    	 for (int k=0; k<scoreboard.size();k++)
				    	 {if (endOfGameScoreboard.getPlayerNameForScoreboard().equals(scoreboard.get(k)))
				    		
				    	 				    		 sum=sum +1;
				    	 }
				    	 
				    	 endOfGameScoreboard.setTargetsAcquired(sum);
				    	 endOfGameScoreboard.printScoreBoard();
				     }
				    	 
				}	
				
							

				}
			
	

			}

		}

	

