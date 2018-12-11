package calculator_AndersHansson.calculator_AndersHansson;


public class AdvancedOperations implements CalculatorAdvancedOperationsInterface{
	public double svar1;
	public double squrt(double variabel1) {
		svar1=Math.sqrt(variabel1);
		return svar1;
	}

	public double modelus(double variabel1, double variabel2) {
		svar1=variabel1%variabel2;
		return svar1;
	}

	public double inverse(double variabel1) {
		svar1=1/variabel1;
		return svar1;
	}

	public double cos(double variabel1) {
		svar1=Math.cos(variabel1);
		return svar1;
	}

	public double sin(double variabel1) {
		svar1=Math.sin(variabel1);
		return svar1;
	}

	public double tan(double variabel1) {
		svar1=Math.tan(variabel1);
		return svar1;
	}

	public double power(double variabel1, double variabel2) {
		svar1=Math.pow(variabel1, variabel2);
		return svar1;
	}

}


