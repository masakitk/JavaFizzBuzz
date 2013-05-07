package mdon.learning;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	@Ignore
	public void Žó“üƒeƒXƒg_30‚Ü‚Å‚ÌFizzBuzz•ÏŠ·() {
		int[] numbers = new int[]{
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
		String[] expected = new String[]{
				"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
				"11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
				"Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28","29", "FizzBuzz",
		};
		
		assertThat(new FizzBuzz().convertNumbers(numbers), equalTo(expected));
	}

}
