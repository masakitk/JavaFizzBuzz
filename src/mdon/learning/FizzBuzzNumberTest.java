package mdon.learning;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzNumberTest {

	@Test
	public void �P�̃e�X�g_1�̎���1() {
		assertThat(new FizzBuzzNumber(1).convert(), equalTo("1"));
	}

	@Test
	public void �P�̃e�X�g_2�̎���3() {
		assertThat(new FizzBuzzNumber(2).convert(), equalTo("2"));
	}

	@Test
	public void �P�̃e�X�g_3�̎���Fizz() {
		assertThat(new FizzBuzzNumber(3).convert(), equalTo("Fizz"));
	}

	@Test
	public void �P�̃e�X�g_6�̎���Fizz() {
		assertThat(new FizzBuzzNumber(6).convert(), equalTo("Fizz"));
	}

	@Test
	public void �P�̃e�X�g_5�̎���Buzz() {
		assertThat(new FizzBuzzNumber(5).convert(), equalTo("Buzz"));
	}

	@Test
	public void �P�̃e�X�g_10�̎���Buzz() {
		assertThat(new FizzBuzzNumber(10).convert(), equalTo("Buzz"));
	}

	@Test
	public void �P�̃e�X�g_15�̎���FizzBuzz() {
		assertThat(new FizzBuzzNumber(15).convert(), equalTo("FizzBuzz"));
	}

}
