package calculator_AndersHansson.calculator_AndersHansson;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;
/**
 * basic unit testing for AdvancedOperations
 */
public class TestOfAdvancedOperations {
	private static final Logger LOG = Logger.getLogger(AdvancedOperations.class.getName());
	AdvancedOperations advanced=new AdvancedOperations();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();
	
	@Test
	public void testSqurtPositiveNumbers() {
		double variabel1=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*1000));
			svar = Math.sqrt(variabel1);
			
			LOG.info("Testing the method squrt with: "+ variabel1);
			assertEquals(Math.round(advanced.squrt(variabel1)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testSqurtNegativeNumbers() {
		double variabel1=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
			svar = Math.sqrt(variabel1);
			
			LOG.info("Testing the method squrt with: "+ variabel1);
			assertEquals(Math.round(advanced.squrt(variabel1)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testSqurtZerosNumbers() {
		double variabel1=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			svar = Math.sqrt(variabel1);
			
			LOG.info("Testing the method squrt with: "+ variabel1);
			assertEquals(Math.round(advanced.squrt(variabel1)), Math.round(svar),0.1);
		}
	}
	@Test
	public void testModelusPositiveNumbers() {
		double variabel1=0;
		double variabel2=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*1000));
			variabel2 = Double.valueOf(df.format(random.nextDouble()*1000));
			svar = variabel1 % variabel2;
			
			LOG.info("Testing the method modelus with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(advanced.modelus(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testModelusNegativeNumbers() {
		double variabel1=0;
		double variabel2=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
			variabel2 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
			svar = variabel1 % variabel2;
			
			LOG.info("Testing the method modelus with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(advanced.modelus(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testModelusZerosNumbers() {
		double variabel1=0;
		double variabel2=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel2 = Double.valueOf(df.format(random.nextDouble()*1000));
			svar = variabel1 % variabel2;
			
			LOG.info("Testing the method modelus with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(advanced.modelus(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*1000));
			variabel2=0;
			svar = variabel1 % variabel2;
			
			LOG.info("Testing the method modelus with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(advanced.modelus(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testInversePositiveNumbers() {
		double variabel1=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*1000));
			svar = 1/(variabel1);
			
			LOG.info("Testing the method inverse with: "+ variabel1);
			assertEquals(Math.round(advanced.inverse(variabel1)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testInverseNegativeNumbers() {
		double variabel1=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
			svar =1/(variabel1);
			
			LOG.info("Testing the method inverse with: "+ variabel1);
			assertEquals(Math.round(advanced.inverse(variabel1)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testInverseZerosNumbers() {
		double variabel1=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			svar = 1/(variabel1);
			
			LOG.info("Testing the method inverse with: "+ variabel1);
			assertEquals(Math.round(advanced.inverse(variabel1)), Math.round(svar),0.1);
		}
	}
	@Test
	public void testCosPositiveNumbers() {
		double variabel1=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*1000));
			svar = Math.cos(variabel1);
			
			LOG.info("Testing the method cos with: "+ variabel1);
			assertEquals(Math.round(advanced.cos(variabel1)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testCosNegativeNumbers() {
		double variabel1=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
			svar =Math.cos(variabel1);
			
			LOG.info("Testing the method cos with: "+ variabel1);
			assertEquals(Math.round(advanced.cos(variabel1)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testCosZerosNumbers() {
		double variabel1=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			svar = Math.cos(variabel1);
			
			LOG.info("Testing the method cos with: "+ variabel1);
			assertEquals(Math.round(advanced.cos(variabel1)), Math.round(svar),0.1);
		}
	}
	@Test
	public void testSinPositiveNumbers() {
		double variabel1=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*1000));
			svar = Math.sin(variabel1);
			
			LOG.info("Testing the method sin with: "+ variabel1);
			assertEquals(Math.round(advanced.sin(variabel1)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testSinNegativeNumbers() {
		double variabel1=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
			svar =Math.sin(variabel1);
			
			LOG.info("Testing the method sin with: "+ variabel1);
			assertEquals(Math.round(advanced.sin(variabel1)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testSinZerosNumbers() {
		double variabel1=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			svar = Math.sin(variabel1);
			
			LOG.info("Testing the method sin with: "+ variabel1);
			assertEquals(Math.round(advanced.sin(variabel1)), Math.round(svar),0.1);
		}
	}
	@Test
	public void testTanPositiveNumbers() {
		double variabel1=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*1000));
			svar = Math.tan(variabel1);
			
			LOG.info("Testing the method tan with: "+ variabel1);
			assertEquals(Math.round(advanced.tan(variabel1)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testTanNegativeNumbers() {
		double variabel1=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
			svar =Math.tan(variabel1);
			
			LOG.info("Testing the method tan with: "+ variabel1);
			assertEquals(Math.round(advanced.tan(variabel1)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testTanZerosNumbers() {
		double variabel1=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			svar = Math.tan(variabel1);
			
			LOG.info("Testing the method tan with: "+ variabel1);
			assertEquals(Math.round(advanced.tan(variabel1)), Math.round(svar),0.1);
		}
	}
	@Test
	public void testPowerPositiveNumbers() {
		double variabel1=0;
		double variabel2=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*1000));
			variabel2 = Double.valueOf(df.format(random.nextDouble()*1000));
			svar = Math.pow(variabel1, variabel2);
			
			LOG.info("Testing the method power with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(advanced.power(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testPowerNegativeNumbers() {
		double variabel1=0;
		double variabel2=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
			variabel2 = Double.valueOf(df.format(random.nextDouble()*(-1000)));
			svar = Math.pow(variabel1, variabel2);
			
			LOG.info("Testing the method power with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(advanced.power(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
	}
	@Test
	public void testPowerZerosNumbers() {
		double variabel1=0;
		double variabel2=0;
		double svar = 0;
		
		for(int i = 0;i<50;i++) {
			variabel2 = Double.valueOf(df.format(random.nextDouble()*1000));
			svar = Math.pow(variabel1, variabel2);
			
			LOG.info("Testing the method power with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(advanced.power(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
		for(int i = 0;i<50;i++) {
			variabel1 = Double.valueOf(df.format(random.nextDouble()*1000));
			variabel2=0;
			svar = Math.pow(variabel1, variabel2);
			
			LOG.info("Testing the method power with: "+ variabel1 +" and " + variabel2);
			assertEquals(Math.round(advanced.power(variabel1, variabel2)), Math.round(svar),0.1);
			
		}
	}

}
