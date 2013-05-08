package mdon.learning;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzNumberTest {

	@Test
	public void 単体テスト_1の時は1() {
		assertThat(new FizzBuzzNumber(1).convert(), equalTo("1"));
	}

	@Test
	public void 単体テスト_2の時は3() {
		assertThat(new FizzBuzzNumber(2).convert(), equalTo("2"));
	}

	@Test
	public void 単体テスト_3の時はFizz() {
		assertThat(new FizzBuzzNumber(3).convert(), equalTo("Fizz"));
	}

	@Test
	public void 単体テスト_6の時はFizz() {
		assertThat(new FizzBuzzNumber(6).convert(), equalTo("Fizz"));
	}

	@Test
	public void 単体テスト_5の時はBuzz() {
		assertThat(new FizzBuzzNumber(5).convert(), equalTo("Buzz"));
	}

	@Test
	public void 単体テスト_10の時はBuzz() {
		assertThat(new FizzBuzzNumber(10).convert(), equalTo("Buzz"));
	}

	@Test
	public void 単体テスト_15の時はFizzBuzz() {
		assertThat(new FizzBuzzNumber(15).convert(), equalTo("FizzBuzz"));
	}

}
