package mdon.learning;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzNumberTest {

	@Test
	public void �P�̃e�X�g_1�̎���1() {
		assertThat(FizzBuzzNumber.New(1).convert(), equalTo("1"));
	}

}
