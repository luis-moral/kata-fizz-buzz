package es.molabs.kata.fizzbuzz;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FizzBuzzShould
{
	private FizzBuzz fizzBuzz;

	@Test
	public void be_fizz_when_dividable_by_3()
	{
		Assert.assertThat(fizzBuzz.word(3), Is.is(FizzBuzz.WORD_FIZZ));
	}

	@Test
	public void be_buzz_when_dividable_by_5()
	{
		Assert.assertThat(fizzBuzz.word(5), Is.is(FizzBuzz.WORD_BUZZ));
	}

	@Test
	public void be_fizzbuzz_when_dividable_by_3_and_5()
	{
		Assert.assertThat(fizzBuzz.word(15), Is.is(FizzBuzz.WORD_FIZZBUZZ));
	}

	@Test
	public void be_string_input_otherwise()
	{
		Assert.assertThat(fizzBuzz.word(2), Is.is("2"));
	}

	@Before
	public void setUp()
	{
		fizzBuzz = new FizzBuzz();
	}
}