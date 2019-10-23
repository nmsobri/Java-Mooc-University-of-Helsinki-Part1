
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slier
 */
public class Team {

	private int teamSize;
	private String name;
	private ArrayList<Player> players;

	public Team(String name) {
		this.teamSize = 16;
		this.name = name;
		this.players = new ArrayList<Player>();
	}

	public String getName() {
		return this.name;
	}

	public void addPlayer(Player player) {
		if (this.players.size() < this.teamSize) {
			this.players.add(player);
		}
	}

	public void printPlayers() {
		for (Player player : this.players) {
			System.out.println(player);
		}
	}

	public void setMaxSize(int size) {
		this.teamSize = size;
	}

	public int size() {
		return this.players.size();
	}

	public int goals() {
		int totalGoals = 0;

		for (Player player : this.players) {
			totalGoals += player.goals();
		}

		return totalGoals;
	}
}
