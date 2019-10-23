
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slier
 */
public class BirdWatcher {

	private Scanner scanner;
	private ArrayList<Bird> birds;

	public BirdWatcher(Scanner scanner) {
		this.scanner = scanner;
		this.birds = new ArrayList<Bird>();
	}

	public void printCommand() {
		System.out.println("Available commands:");
		System.out.println("Add");
		System.out.println("Observation");
		System.out.println("Statistics");
		System.out.println("Show");
		System.out.println("Quit");
		System.out.println();
	}

	public void run() {
		this.printCommand();

		while (true) {
			System.out.print("Command: ");
			String command = this.scanner.nextLine();

			if (command.equalsIgnoreCase("quit")) {
				break;
			} else if (command.equalsIgnoreCase("add")) {
				this.addBird();
			} else if (command.equalsIgnoreCase("observation")) {
				this.observeBird();
			} else if (command.equalsIgnoreCase("statistics")) {
				this.birdStatistics();
			} else if (command.equalsIgnoreCase("show")) {
				this.showBird();
			} else {
				continue;
			}
		}
	}

	private void addBird() {
		System.out.print("Name: ");
		String name = this.scanner.nextLine();
		System.out.print("Latin name: ");
		String latinName = this.scanner.nextLine();

		Bird bird = new Bird(name, latinName);
		this.birds.add(bird);

	}

	private void observeBird() {
		System.out.print("What was observed:? ");
		String name = this.scanner.nextLine();

		for (Bird b : this.birds) {
			if (b.name().contains(name)) {
				b.increaseObservation();
				return;
			}
		}

		System.out.println("Is not a bird!");
	}

	private void birdStatistics() {
		for (Bird b : this.birds) {
			System.out.println(b);
		}
	}

	private void showBird() {
		System.out.print("What:? ");
		String name = this.scanner.nextLine();

		for (Bird b : this.birds) {
			if (b.name().contains(name)) {
				System.out.println(b);
			}
		}
	}
}
