package calculator_AndersHansson.calculator_AndersHansson;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;
/**
 * Basic unit testing for BasicOperations
 */
public class TestOfBasicOperations {
	private static final Logger LOG = Logger.getLogger(BasicOperations.class.getName());
	BasicOperations basic = new BasicOperations();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testAdditionPositiveNumbers() {
		double variabel1=0;
		double variabel2=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*1000));
			variabel2 = Double.valueOf(df.format(random.nextDouble()*1000));
			svar = variabel1 + variabel2;
			
			LOG.info("Testing the method addition with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(basic.addition(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testAdditionNegativeNumbers() {
		double variabel1=0;
		double variabel2=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
			variabel2 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
			svar = variabel1 + variabel2;
			
			LOG.info("Testing the method addition with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(basic.addition(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testAdditionZerosNumbers() {
		double variabel1=0;
		double variabel2=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel2 = Double.valueOf(df.format(random.nextDouble()*1000));
			svar = variabel1 + variabel2;
			
			LOG.info("Testing the method addition with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(basic.addition(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*1000));
			variabel2=0;
			svar = variabel1 + variabel2;
			
			LOG.info("Testing the method addition with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(basic.addition(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testSubtractionPositiveNumbers() {
		double variabel1=0;
		double variabel2=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*1000));
			variabel2 = Double.valueOf(df.format(random.nextDouble()*1000));
			svar = variabel1 - variabel2;
			
			LOG.info("Testing the method subtraction with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(basic.subtraction(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testSubtractionNegativeNumbers() {
		double variabel1=0;
		double variabel2=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
			variabel2 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
			svar = variabel1 - variabel2;
			
			LOG.info("Testing the method subtraction with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(basic.subtraction(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testSubtractionZerosNumbers() {
		double variabel1=0;
		double variabel2=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel2 = Double.valueOf(df.format(random.nextDouble()*1000));
			svar = variabel1 - variabel2;
			
			LOG.info("Testing the method subtraction with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(basic.subtraction(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*1000));
			variabel2=0;
			svar = variabel1 - variabel2;
			
			LOG.info("Testing the method subtraction with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(basic.subtraction(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testMultiplicationPositiveNumbers() {
		double variabel1=0;
		double variabel2=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*1000));
			variabel2 = Double.valueOf(df.format(random.nextDouble()*1000));
			svar = variabel1 * variabel2;
			
			LOG.info("Testing the method multiplication with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(basic.multiplication(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testMultiplicationNegativeNumbers() {
		double variabel1=0;
		double variabel2=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
			variabel2 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
			svar = variabel1 * variabel2;
			
			LOG.info("Testing the method multiplication with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(basic.multiplication(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testMultiplicationZerosNumbers() {
		double variabel1=0;
		double variabel2=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel2 = Double.valueOf(df.format(random.nextDouble()*1000));
			svar = variabel1 * variabel2;
			
			LOG.info("Testing the method multiplication with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(basic.multiplication(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*1000));
			variabel2=0;
			svar = variabel1 * variabel2;
			
			LOG.info("Testing the method multiplication with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(basic.multiplication(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testDivisionPositiveNumbers() {
		double variabel1=0;
		double variabel2=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*1000));
			variabel2 = Double.valueOf(df.format(random.nextDouble()*1000));
			svar = variabel1 / variabel2;
			
			LOG.info("Testing the method division with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(basic.division(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testDivisionNegativeNumbers() {
		double variabel1=0;
		double variabel2=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
			variabel2 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
			svar = variabel1 / variabel2;
			
			LOG.info("Testing the method division with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(basic.division(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testDivisionZerosNumbers() {
		double variabel1=0;
		double variabel2=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel2 = Double.valueOf(df.format(random.nextDouble()*1000));
			svar = variabel1 / variabel2;
			
			LOG.info("Testing the method division with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(basic.division(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*1000));
			variabel2=0;
			svar = variabel1 / variabel2;
			
			LOG.info("Testing the method division with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(basic.division(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
	}
}
