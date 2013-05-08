package mdon.learning;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzNumberTest {

	@Test
	public void �P�̃e�X�g_1�̎���1() {
		assertThat(FizzBuzzNumber.New(1).convert(), equalTo("1"));
	}

	@Test
	public void �P�̃e�X�g_2�̎���3() {
		assertThat(FizzBuzzNumber.New(2).convert(), equalTo("2"));
	}

	@Test
	public void �P�̃e�X�g_3�̎���Fizz() {
		assertThat(FizzBuzzNumber.New(3).convert(), equalTo("Fizz"));
	}

	@Test
	public void �P�̃e�X�g_6�̎���Fizz() {
		assertThat(FizzBuzzNumber.New(6).convert(), equalTo("Fizz"));
	}

	@Test
	public void �P�̃e�X�g_5�̎���Buzz() {
		assertThat(FizzBuzzNumber.New(5).convert(), equalTo("Buzz"));
	}

	@Test
	public void �P�̃e�X�g_10�̎���Buzz() {
		assertThat(FizzBuzzNumber.New(10).convert(), equalTo("Buzz"));
	}

	@Test
	public void �P�̃e�X�g_15�̎���FizzBuzz() {
		assertThat(FizzBuzzNumber.New(15).convert(), equalTo("FizzBuzz"));
	}

}
