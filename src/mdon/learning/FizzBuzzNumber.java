package mdon.learning;

public class FizzBuzzNumber {

	private int i;

	public FizzBuzzNumber(int i) {
		this.i = i;
	}

	public String convert() {
		return i % 15 == 0 ? "FizzBuzz" 
				: i % 5 == 0 ? "Buzz"
				: i % 3 == 0 ? "Fizz"
				: String.valueOf(i);
	}

	public static FizzBuzzNumber New(int i) {
		return new FizzBuzzNumber(i);
	}

}
