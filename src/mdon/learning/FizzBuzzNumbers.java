package mdon.learning;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzNumbers {

	private final int[] numbers;

	public FizzBuzzNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public String[] convert() {
		List<String> converted = new ArrayList<String>();
		for (int i : numbers){
			converted.add(new FizzBuzzNumber(i).convert());
		}
		return converted.toArray(new String[0]);
	}
}
