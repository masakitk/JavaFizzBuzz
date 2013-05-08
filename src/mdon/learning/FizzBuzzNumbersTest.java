package mdon.learning;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import mockit.Expectations;
import mockit.Mocked;

import org.junit.Ignore;
import org.junit.Test;

public class FizzBuzzNumbersTest {

	@Mocked
	private FizzBuzzNumber fizzBuzzNumber; 
	
	@Test
	@Ignore
	public void 受入テスト_30までのFizzBuzz変換() {
		int[] numbers = new int[]{
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
		String[] expected = new String[]{
				"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
				"11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
				"Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28","29", "FizzBuzz",
		};
		
		assertThat(new FizzBuzzNumbers(numbers).convert(), equalTo(expected));
	}
	
	@Test
	public void 単体テスト_数字配列の各要素に対して変換処理が呼び出されること() {
		
		new Expectations() { { 
			FizzBuzzNumber.New(1); returns(fizzBuzzNumber);
			fizzBuzzNumber.convert(); returns(any);
			FizzBuzzNumber.New(2); returns(fizzBuzzNumber);
			fizzBuzzNumber.convert(); returns(any);
			FizzBuzzNumber.New(3); returns(fizzBuzzNumber);
			fizzBuzzNumber.convert(); returns(any);
		} };
		
		int[] numbers = new int[]{1, 2, 3};
		new FizzBuzzNumbers(numbers).convert();
	}

}
