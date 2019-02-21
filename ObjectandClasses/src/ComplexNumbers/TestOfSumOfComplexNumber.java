package ComplexNumbers;

import static org.junit.Assert.*;

import org.junit.Test;
	public class TestOfSumOfComplexNumber 
	{
		private ComplexNumbers complexNumberOne = new ComplexNumbers();
		private ComplexNumbers complexNumberTwo = new ComplexNumbers();
		private ComplexNumbers complexNumberThree = new ComplexNumbers();
		
		@Test
		public void complexnumberSumTestForPositiveRealAndImagenary()
		{
			complexNumberOne.set(2,5);
			complexNumberTwo.set(3,5);									//sets second complex number's value
			
			complexNumberThree.addTwoComplexNumber(complexNumberOne,complexNumberTwo);
	
			assertEquals(5,complexNumberThree.getRealNumber());
		
		}
		
		@Test
		public void complexnumberSumTestForPositiveRealAndNegativeImagenary()
		{
			complexNumberOne.set(2,-5);
			complexNumberTwo.set(3,-5);									//sets second complex number's value
			
			complexNumberThree.addTwoComplexNumber(complexNumberOne,complexNumberTwo);
	
			assertEquals(-10,complexNumberThree.getImaginaryNumber());
		
		}
	}

	
	
