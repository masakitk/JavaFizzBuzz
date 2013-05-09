package mdon.learning;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzableNumberTest {

	@Test
	public void �P�̃e�X�g_1�̎���1() {
		assertThat(new FizzBuzzableNumber(1).convert(), equalTo("1"));
	}

	@Test
	public void �P�̃e�X�g_2�̎���3() {
		assertThat(new FizzBuzzableNumber(2).convert(), equalTo("2"));
	}

	@Test
	public void �P�̃e�X�g_3�̎���Fizz() {
		assertThat(new FizzBuzzableNumber(3).convert(), equalTo("Fizz"));
	}

	@Test
	public void �P�̃e�X�g_6�̎���Fizz() {
		assertThat(new FizzBuzzableNumber(6).convert(), equalTo("Fizz"));
	}

	@Test
	public void �P�̃e�X�g_5�̎���Buzz() {
		assertThat(new FizzBuzzableNumber(5).convert(), equalTo("Buzz"));
	}

	@Test
	public void �P�̃e�X�g_10�̎���Buzz() {
		assertThat(new FizzBuzzableNumber(10).convert(), equalTo("Buzz"));
	}

	@Test
	public void �P�̃e�X�g_15�̎���FizzBuzz() {
		assertThat(new FizzBuzzableNumber(15).convert(), equalTo("FizzBuzz"));
	}
}
