package mdon.learning;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzableNumberTest {

	@Test
	public void 単体テスト_1の時は1() {
		assertThat(new FizzBuzzableNumber(1).convert(), equalTo("1"));
	}

	@Test
	public void 単体テスト_2の時は3() {
		assertThat(new FizzBuzzableNumber(2).convert(), equalTo("2"));
	}

	@Test
	public void 単体テスト_3の時はFizz() {
		assertThat(new FizzBuzzableNumber(3).convert(), equalTo("Fizz"));
	}

	@Test
	public void 単体テスト_6の時はFizz() {
		assertThat(new FizzBuzzableNumber(6).convert(), equalTo("Fizz"));
	}

	@Test
	public void 単体テスト_5の時はBuzz() {
		assertThat(new FizzBuzzableNumber(5).convert(), equalTo("Buzz"));
	}

	@Test
	public void 単体テスト_10の時はBuzz() {
		assertThat(new FizzBuzzableNumber(10).convert(), equalTo("Buzz"));
	}

	@Test
	public void 単体テスト_15の時はFizzBuzz() {
		assertThat(new FizzBuzzableNumber(15).convert(), equalTo("FizzBuzz"));
	}
}
