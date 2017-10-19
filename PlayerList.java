//  Ray Kecham
//  CST-105
//  October 15 2017
//  Charles Lively
package Week5;
import java.util.*;
public class PlayerList {

	final private static ArrayList<PlayerInfo> PLAYERS_LIST = new ArrayList<PlayerInfo>();

	public PlayerList() {
		createPlayers();
	}

	public static void createPlayers() {
		PlayerInfo ketcham = new PlayerInfo("Ray Ketcham", 23, 258, 70, 69.8, 4, 0, 1500, 456, 10);
		PlayerInfo ketchup = new PlayerInfo("Pete Ketchup", 24, 290, 68, 15.9, 9, 9, 2500, 90, 20);
		PlayerInfo catcham = new PlayerInfo("Tasty Catcham", 25, 220, 81, 44.2, 12, 15, 3500, 1119, 30);
                PlayerInfo ketchups = new PlayerInfo("Doodle Ketchups", 26, 222, 73, 115.5, 0, 5, 9800, 1937, 40);
		PlayerInfo ketching = new PlayerInfo("Gotta'be Ketching", 21, 243, 89, 99.9, 0, 2, 500, 736, 50);
		PlayerInfo ketchall = new PlayerInfo("Your Ketchall", 22, 275, 66, 70.2, 30, 11, 100, 666, 60);
		PlayerInfo ketchit = new PlayerInfo("Dont Ketchit", 28, 265, 69, 66.5, 1, 2, 930, 188, 70);
		PlayerInfo catchem = new PlayerInfo("Loveto Catchem", 25, 214, 77, 74.1, 50, 0, 103, 628, 80);
		PlayerInfo ketchyou = new PlayerInfo("Police Ketchyou", 27, 212, 76, 80.9, 22, 5, 306, 68, 90);
		PlayerInfo ketchclown = new PlayerInfo("Halloween Ketchclown", 20, 205, 79, 40.9, 0, 26, 555, 88, 11);

		PLAYERS_LIST.add(ketcham);
		PLAYERS_LIST.add(ketchup);
		PLAYERS_LIST.add(catcham);
		PLAYERS_LIST.add(ketchups);
		PLAYERS_LIST.add(ketching);
		PLAYERS_LIST.add(ketchall);
		PLAYERS_LIST.add(ketchit);
		PLAYERS_LIST.add(catchem);
		PLAYERS_LIST.add(ketchyou);
		PLAYERS_LIST.add(ketchclown);
	}

	public String toString() {
		String list = " ";
		for (PlayerInfo y : PLAYERS_LIST)
			list += (y.name + " - " + PLAYERS_LIST.indexOf(y));
		return list;
	}

	public static void main(String[] args) {
		PlayerList test = new PlayerList();
		System.out.println("PlayersNames: " + (test.toString()));

		
		System.out.println("Getters: " + PlayerList.PLAYERS_LIST.get(9).playerName() 
                        + PlayerList.PLAYERS_LIST.get(9).playerPassingTouchDowns() 
                        + " " + PlayerList.PLAYERS_LIST.get(9).playerWeight() + "Player Rating: " 
                        + PlayerList.PLAYERS_LIST.get(9).playerRating() + " "
                );
		
		PlayerList.PLAYERS_LIST.get(9).setWeight(200);
		PlayerList.PLAYERS_LIST.get(9).setCompletions(5);
		System.out.println("Setter: Ketchclown passing yards now equals " + PlayerList.PLAYERS_LIST.get(9).playerPassingYards() + " ");
	}
}
