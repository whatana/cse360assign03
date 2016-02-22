/** allows user to do addition subtraction, divide, multiply, and get total
 *  also can see calculation history
 *  
 *  @author Xin Zhang
 *  
 *  PIN: 911
 *  @Version Feb 21, 2016
 */
package cse360assign3;

public class Calculator {

	private int total;
	
	private String operations = "0";
	/**
	 *  constructor for Calculator
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * return total value that user's calculation
	 * @return total value
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * add number to total
	 * @param value be added
	 */
	public void add (int value) {
		
		total = total + value ;
		
		operations += " + " + value;
	}
	/**
	 * subtract number from total
	 * @param value be subtracted
	 */
	public void subtract (int value) {
		total = total - value ;
		
		operations += " - " + value;
	}
	/**
	 * multiply total by value
	 * @param value factor
	 */
	public void multiply (int value) {
		
		total = total * value ;
		
		operations += " * " + value;
	}
	/**
	 * total divide by value
	 * @param value divisible
	 */
	public void divide (int value) {
		
		if (value == 0 )
		{
			total = 0;
		}
		else
		{	
		
			total = total / value ;
		
		}
		operations += " / " + value;
	}
	/**
	 * string a getHistory from Calculation
	 * @return calculation History
	 */
	public String getHistory () {
		return operations;
	}
}