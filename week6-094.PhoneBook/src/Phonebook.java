
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
public class Phonebook {

	private ArrayList<Person> persons;

	public Phonebook() {
		this.persons = new ArrayList<Person>();
	}

	public void add(Person person) {
		this.persons.add(person);
	}

	public void add(String name, String telephone) {
		this.persons.add(new Person(name, telephone));
	}

	public void printAll() {
		for (Person p : this.persons) {
			System.out.println(p);
		}
	}

	public String searchNumber(String name) {
		for (Person p : this.persons) {
			if (p.getName().contains(name)) {
				return p.getNumber();
			}
		}

		return "number not known";
	}

}
