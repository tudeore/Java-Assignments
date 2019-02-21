package Basic_java;

public class SquareOfNumber {
	
	void square(int b)
	{
		int a;
		int square=0;
		int count = 1;
		int table=0;
		while(count <= 9 ){
			table = b*count;
			square = table*table;
			System.out.println("Number =" +table + "square of number=" +square);
			count++;
			
		}
	}
	
	public static void main(String[] args){
		
		int number = 5;
		SquareOfNumber sq = new SquareOfNumber();
		sq.square(number);
	}

}
