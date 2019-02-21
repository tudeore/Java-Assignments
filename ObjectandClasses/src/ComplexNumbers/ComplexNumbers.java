package ComplexNumbers;

public class ComplexNumbers 
{
	private int realNumber;
	private int imaginaryNumber;
	
	
	public int getRealNumber() {
		return this.realNumber;
	}

	public int getImaginaryNumber() {
		return this.imaginaryNumber;
	}

	
	public void set(int realNumber,int imaginaryNumber)
	{
		this.realNumber = realNumber;
		this.imaginaryNumber = imaginaryNumber;
	}
	
	public ComplexNumbers addTwoComplexNumber(ComplexNumbers numberOne,ComplexNumbers numberTwo)
	{
		this.realNumber = numberOne.realNumber +numberTwo.realNumber;
		this.imaginaryNumber = numberOne.imaginaryNumber +numberTwo.imaginaryNumber;
		
		System.out.println(this.realNumber + " + (" +this.imaginaryNumber +")" +"i");
		return this;
	}
	
	
}
