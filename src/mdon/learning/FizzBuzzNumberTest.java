package mdon.learning;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzNumberTest {

	@Test
	public void 単体テスト_1の時は1() {
		assertThat(FizzBuzzNumber.New(1).convert(), equalTo("1"));
	}

}
