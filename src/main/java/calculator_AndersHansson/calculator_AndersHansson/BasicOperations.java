package calculator_AndersHansson.calculator_AndersHansson;


public class BasicOperations implements CalculatorBasicOperationsInterface {

	public double svar;

	public double addition(double variabel1, double variabel2) {
		svar=variabel1+variabel2;
		return svar;
		
		
	}

	public double subtraction(double variabel1, double variabel2) {
		svar=variabel1-variabel2;
		return svar;
		
	}

	public double multiplication(double variabel1, double variabel2) {
		svar=variabel1*variabel2;
		return svar;
		
	}

	public double division(double variabel1, double variabel2) {
		svar=variabel1/variabel2;
		return svar;
		
	}

}

