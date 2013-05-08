package mdon.learning;

import mockit.Expectations;
import mockit.Mocked;

import org.junit.Test;

public class FizzBuzzNumbersTest {

	@Mocked
	private FizzBuzzNumber fizzBuzzNumber; 
	
	@Test
	public void �P�̃e�X�g_�����z��̊e�v�f�ɑ΂��ĕϊ��������Ăяo����邱��() {
		
		new Expectations() { { 
			new FizzBuzzNumber(1); returns(fizzBuzzNumber);
			fizzBuzzNumber.convert(); returns(any);
			new FizzBuzzNumber(2); returns(fizzBuzzNumber);
			fizzBuzzNumber.convert(); returns(any);
			new FizzBuzzNumber(3); returns(fizzBuzzNumber);
			fizzBuzzNumber.convert(); returns(any);
		} };
		
		int[] numbers = new int[]{1, 2, 3};
		new FizzBuzzNumbers(numbers).convert();
	}

}
