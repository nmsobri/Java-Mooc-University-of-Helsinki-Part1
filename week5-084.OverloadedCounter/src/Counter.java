/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slier
 */
public class Counter {

	private int value;
	private boolean check;

	public Counter(int value, boolean check) {
		this.value = value;
		this.check = check;
	}

	public Counter(int value) {
		this.value = value;
		this.check = false;
	}

	public Counter(boolean check) {
		this.value = 0;
		this.check = check;
	}

	public Counter() {
		this.value = 0;
		this.check = false;
	}

	public int value() {
		return this.value;
	}

	public void increase() {
		this.value++;
	}

	public void decrease() {
		this.value--;

		if (this.check && this.value < 0) {
			this.value = 0;
		}
	}

	public void increase(int value) {
		if (value > 0) {
			this.value += value;
		}
	}

	public void decrease(int value) {
		if (value > 0) {
			this.value -= value;

			if (this.check && this.value < 0) {
				this.value = 0;
			}
		}
	}

	@Override
	public String toString() {
		return this.value + "";
	}

}
