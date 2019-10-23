
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slier
 */
public class NightSky {

	private double density;
	private int width;
	private int height;
	private int starsInLastPrint;

	public NightSky(double density) {
		this.density = density;
		this.width = 20;
		this.height = 10;
		this.starsInLastPrint = 0;
	}

	public NightSky(int width, int height) {
		this.density = 0.1;
		this.width = width;
		this.height = height;
		this.starsInLastPrint = 0;
	}

	public NightSky(double density, int widht, int height) {
		this.density = density;
		this.width = widht;
		this.height = height;
		this.starsInLastPrint = 0;

	}

	public void printLine() {
		Random random = new Random();

		for (int i = 0; i < this.width; i++) {

			if (random.nextDouble() < this.density) {
				System.out.print("*");
				this.starsInLastPrint++;

			} else {
				System.out.print(" ");

			}
		}

		System.out.println();
	}

	public void print() {
		for (int i = 0; i < this.height; i++) {
			this.printLine();
		}
	}

	public int starsInLastPrint() {
		int temp = this.starsInLastPrint;
		this.starsInLastPrint = 0;
		return temp;
	}

}
