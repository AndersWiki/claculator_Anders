package calculator_AndersHansson.calculator_AndersHansson;
/**
 *  AdvancedOperations have methods for sqrt, modelus, inverse, cos, sin, tan, and power
 * <p>
 * @author      Anders Hansson
 * @version     1.0 
 * @since   2018-12-13       
 */

public class AdvancedOperations implements CalculatorAdvancedOperationsInterface{
	public double svar1;
	/**
	 * Returns the correctly rounded positive square root of a double value.
	 * @param variabel1 double
	 * @return double square root of input
	 */
	public double squrt(double variabel1) {
		svar1=Math.sqrt(variabel1);
		return svar1;
	}
	/**
	 * Returns the modelus of two doubles.
	 * @param variabel1 double
	 * @param variabel2 double
	 * @return double modelus
	 */
	public double modelus(double variabel1, double variabel2) {
		svar1=variabel1%variabel2;
		return svar1;
	}
	/**
	 * Returns the invert of a double value.
	 * @param variabel1 double
	 * @return double invert
	 */
	public double inverse(double variabel1) {
		svar1=1/variabel1;
		return svar1;
	}
	/**
	 * Returns cosinus of a double value.
	 * @param variabel1 double
	 * @return double cosinus
	 */
	public double cos(double variabel1) {
		svar1=Math.cos(variabel1);
		return svar1;
	}
	/**
	 * Returns sinus of a double value.
	 * @param variabel1 double
	 * @return double sinus
	 */
	public double sin(double variabel1) {
		svar1=Math.sin(variabel1);
		return svar1;
	}
	/**
	 * Returns tangent of a double value.
	 * @param variabel1 double
	 * @return double tangent
	 */
	public double tan(double variabel1) {
		svar1=Math.tan(variabel1);
		return svar1;
	}
	/**
	 * Returns the first double raised to the power of the second double
	 * @param variabel1 double
	 * @param variabel2 double
	 * @return double power
	 */
	public double power(double variabel1, double variabel2) {
		svar1=Math.pow(variabel1, variabel2);
		return svar1;
	}

}


