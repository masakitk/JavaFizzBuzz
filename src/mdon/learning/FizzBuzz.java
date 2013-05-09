package mdon.learning;

public class FizzBuzz {

	public static String[] convert(int[] numbers) {
		return new FizzBuzzableNumbers(numbers).convert();
	}

}
