package mdon.learning;

public class FizzBuzzableNumber {

	private int i;

	public FizzBuzzableNumber(int i) {
		this.i = i;
	}

	public String convert() {
		if (i % 15 == 0) return "FizzBuzz"; 
		if (i % 5 == 0) return "Buzz";
		if (i % 3 == 0) return "Fizz";
		return String.valueOf(i);
	}
}
