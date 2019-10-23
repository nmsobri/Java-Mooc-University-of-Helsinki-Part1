/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slier
 */
public class Bird {

	private String name;
	private String latinName;
	private int observed;

	public Bird(String name, String latinName) {
		this.name = name;
		this.latinName = latinName;
		this.observed = 0;
	}

	public String name() {
		return this.name;
	}

	public int observed() {
		return this.observed;
	}

	public void increaseObservation() {
		this.observed++;
	}

	@Override
	public String toString() {
		return this.name + " (" + this.latinName + "):" + this.observed + " observations";
	}
}
