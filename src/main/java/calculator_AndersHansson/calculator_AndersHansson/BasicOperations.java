package calculator_AndersHansson.calculator_AndersHansson;

/**
 *  BasicOperations have methods for addition, subtraction, multipication and division
 * <p>
 * @author      Anders Hansson
 * @version     1.0 
 * @since   2018-12-13       
 */
public class BasicOperations implements CalculatorBasicOperationsInterface {

	public double svar;
	/**
	 * Returns the added value of two doubles.
	 * @param variabel1 double 
	 * @param variabel2 double
	 * @return double addition
	 */
	public double addition(double variabel1, double variabel2) {
		svar=variabel1+variabel2;
		return svar;
		
		
	}
	/**
	 * Returns the value of first double- the second one in the form of a double
	 * @param variabel1 double 
	 * @param variabel2 double
	 * @return double subtraction
	 */
	public double subtraction(double variabel1, double variabel2) {
		svar=variabel1-variabel2;
		return svar;
		
	}
	/**
	 * Returns the multiplication of two doubles.
	 * @param variabel1 double 
	 * @param variabel2 double
	 * @return double multiplication
	 */
	public double multiplication(double variabel1, double variabel2) {
		svar=variabel1*variabel2;
		return svar;
		
	}
	/**
	 * Returns a double with the value of first double divided by second.
	 * @param variabel1 double 
	 * @param variabel2 double
	 * @return double division
	 */
	public double division(double variabel1, double variabel2) {
		svar=variabel1/variabel2;
		return svar;
		
	}

}

