package es.molabs.kata.fizzbuzz;

public class FizzBuzz
{
	public final static String WORD_FIZZ = "fizz";
	public final static String WORD_BUZZ = "buzz";
	public final static String WORD_FIZZBUZZ = "fizzbuzz";
	
	public String word(int number)
	{
		String result;
		
		if (dividableBy(number, 15))
		{
			result = WORD_FIZZBUZZ;
		}
		else if (dividableBy(number, 5))
		{
			result = WORD_BUZZ;
		}
		else if (dividableBy(number, 3))
		{
			result = WORD_FIZZ;
		}
		else
		{
			result = Integer.toString(number);
		}
		
		return result;
	}
	
	private boolean dividableBy(int number, int divisor)
	{
		return number % divisor == 0;
	}
}
