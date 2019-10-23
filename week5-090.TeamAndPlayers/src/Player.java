/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slier
 */
public class Player {

	private String name;
	private int goalAmount;

	public Player(String name) {
		this.name = name;
		this.goalAmount = 0;
	}

	public Player(String name, int goalAmount) {
		this.name = name;
		this.goalAmount = goalAmount;
	}

	public String getName() {
		return this.name;
	}

	public int goals() {
		return this.goalAmount;
	}

	@Override
	public String toString() {
		return this.name + ", goals " + this.goalAmount;
	}
}
