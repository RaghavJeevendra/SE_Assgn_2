
package cse360assign2;

import java.util.ArrayList;
import java.util.List;

/*============================================================================
Name        : Calculator.java
Author      : Raghav Jeevendra
Date	    : Feb 22, 2019
Description : 
   Implementation of Calculator to do basic functionalities like addition, 
   subtraction, multiplication and division 
  
============================================================================*/

/**
 * @author Raghav Jeevendra
 * @ClassID 421
 * @Assignment number 2
 * 
 *             <p>
 *             Implementation of Calculator to do basic functionalities like addition, 
 * 			   subtraction, multiplication and division 
 * 
 * 			   This class has functions:
 * 			   add function is used to add number to total
 * 			   subtract function is used to subtract number from total
 * 			   multiply function is used to multiply total by number
 * 			   divide function is used to divide total by number
 *
 */

public class Calculator {

	/**
	 * 
	 * Integer total
	 */
	private int total;
	
	private List<String> operationseq;
	
	public Calculator () {
		total = 0; 
		operationseq = new ArrayList<>();
	}
	/**
	 * 
	 * <p>Function return total
	 *
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * 
	 * @param value 
	 * <p>adds value to total
	 *
	 */
	public void add (int value) {
		total = total + value;
		operationseq.add(" + " + value);
	}
	
	/**
	 * 
	 * @param value 
	 * <p>subtracts value from total
	 *
	 */
	public void subtract (int value) {
		total = total - value;
		operationseq.add(" - " + value);
	}
	
	/**
	 * 
	 * @param value 
	 * <p>multiplies total by value
	 *
	 */
	public void multiply (int value) {
		total = total * value;
		operationseq.add(" * " + value);
	}
	
	/**
	 * 
	 * @param value 
	 * <p>divides total by value
	 *
	 */
	public void divide (int value) {
		if(value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}
		operationseq.add(" / " + value);
		
	}
	
	/**
	 * 
	 * <p>returns the history of operations
	 *
	 */
	public String getHistory () {
		String temp = "" ;
		temp = temp + "0";
		for(int iterator = 0 ; iterator < operationseq.size() ; iterator++) {
			temp = temp + operationseq.get(iterator);
		}
		return temp;
	}
}
