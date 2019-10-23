/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slier
 */
public class Person {

	private String name;
	private String telephone;

	public Person(String name, String telephone) {
		this.name = name;
		this.telephone = telephone;
	}

	public String getName() {
		return this.name;
	}

	public String getNumber() {
		return this.telephone;
	}

	public void changeNumber(String number) {
		this.telephone = number;
	}

	@Override
	public String toString() {
		return "" + this.name + " number: " + this.telephone;
	}
}
