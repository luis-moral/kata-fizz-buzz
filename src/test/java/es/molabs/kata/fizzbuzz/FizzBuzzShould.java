package es.molabs.kata.fizzbuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import es.molabs.kata.fizzbuzz.FizzBuzz;

@RunWith(JUnit4.class)
public class FizzBuzzShould
{
	private FizzBuzz fizzBuzz;

	@Test
	public void be_fizz_when_dividable_by_3()
	{
		Assert.assertEquals(FizzBuzz.WORD_FIZZ, fizzBuzz.word(3));
	}

	@Test
	public void be_buzz_when_dividable_by_5()
	{
		Assert.assertEquals(FizzBuzz.WORD_BUZZ, fizzBuzz.word(5));
	}

	@Test
	public void be_fizzbuzz_when_dividable_by_3_and_5()
	{
		Assert.assertEquals(FizzBuzz.WORD_FIZZBUZZ, fizzBuzz.word(15));
	}

	@Test
	public void be_string_input_otherwise()
	{
		int input = 2;
		
		Assert.assertEquals(Integer.toString(input), fizzBuzz.word(input));
	}

	@Before
	public void setUp()
	{
		fizzBuzz = new FizzBuzz();
	}
}