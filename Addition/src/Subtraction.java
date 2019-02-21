	import static org.junit.Assert.*;

import org.junit.Test;


	public class Subtraction {
	
	@Test
	public void TestingOfSubtractionForTwoPositiveNumber()
		{
	    CalculationNumber SubtractionNumber= new SubtractionNumber();  	
		int Result = SubtractionNumber.subtraction(15,15);
		assertEquals(0,Result);
		}
	
	@Test
	public void TestingOfSubtractionForTwoNegativeNumber()
		{
		CalculationNumber SubtractionNumber= new SubtractionNumber();  	
		int Result = SubtractionNumber.subtraction(-50,-15);
		assertEquals(35,Result);
		}
	
	@Test
	public void TestingOfSubtractionForOneNegativeNumber()
		{
		CalculationNumber SubtractionNumber= new SubtractionNumber();  	
		int Result = SubtractionNumber.subtraction(-50,15);
		assertEquals(-65,Result);
		}
	
	@Test
	public void TestingOfSubtractionForOneNegativeAndZeroNumber()
		{
		CalculationNumber SubtractionNumber= new SubtractionNumber();  	
		int Result = SubtractionNumber.subtraction(-50,0);
		assertEquals(-50,Result);
		}
	
	@Test
	public void TestingOfSubtractionForOnePositiveAndZeroNumber()
		{
		CalculationNumber SubtractionNumber= new SubtractionNumber();  	
		int Result = SubtractionNumber.subtraction(50,0);
		assertEquals(50,Result);
		}
	
}
