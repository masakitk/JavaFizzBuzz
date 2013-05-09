package mdon.learning;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzableNumbers {

	private final int[] numbers;

	public FizzBuzzableNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public String[] convert() {
		List<String> converted = new ArrayList<String>();
		for (int i : numbers){
			converted.add(new FizzBuzzableNumber(i).convert());
		}
		return converted.toArray(new String[0]);
	}
}
