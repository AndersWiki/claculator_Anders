package calculator_AndersHansson.calculator_AndersHansson;

import java.util.Scanner;
/**
 *  Main lets you do a calcualtion.
 * <p>
 * @author      Anders Hansson
 * @version     1.0 
 * @since   2018-12-13       
 */
public class Main {

	public static void main(String[] args) {
		BasicOperations basic=new BasicOperations();
		AdvancedOperations advanced=new AdvancedOperations();
		double variabel1=0;
		double variabel2=0;
		int val = 0;
		Scanner in=new Scanner(System.in);
		System.out.println("Vad är första siffran?");
		String firstnumber=in.next();
		try{
		variabel1=Double.parseDouble(firstnumber);
		}
		catch (Exception e){
			System.out.println("Använd bara siffror. Använd . istället för , vid decimaltal");
			in.close();
			System.exit(0);
		}
		System.out.println("Vilket räknesätt vill du använda?\n"
				+ "Tryck 1 för plus. 2 för minus. 3 för multiplikation. 4 för division \n"
				+ "5 för rotenur. 6 för modulus. 7 för inversen. 8 för Cos. 9 för Sin. 10 för Tan. 11 för upphöjt till.");
		String raknesatt=in.next();
		try{
		val=Integer.parseInt(raknesatt);
		}
		catch(Exception e){
			System.out.println("Använd bara siffror 1-11");
			in.close();
			System.exit(0);
		}
		if((val==1)||(val==2)||(val==3)||(val==4)||(val==6)||(val==11)){
			System.out.println("Vad är andra siffran?");
			String secondnumber=in.next();
			try{
			variabel2=Double.parseDouble(secondnumber);
			}
			catch(Exception e){
				System.out.println("Använd bara siffror. Använd . istället för , vid decimaltal");
				in.close();
				System.exit(0);
			}
		}
		if (val==1){
			System.out.println("Svar "+basic.addition(variabel1, variabel2));
		}
		else if(val==2){
			System.out.println("Svar "+basic.subtraction(variabel1, variabel2));	
		}
		else if(val==3){
			System.out.println("Svar "+basic.multiplication(variabel1, variabel2));	
		}
		else if(val==4){
			if(variabel2==0){
				System.out.println("Dela inte på noll det går mot oändligheten");
			}
			else{
			System.out.println("Svar "+basic.division(variabel1, variabel2));
			}
		}
		else if(val==5){
			System.out.println("Svar "+advanced.squrt(variabel1));
		}
		else if(val==6){
			System.out.println("Svar "+advanced.modelus(variabel1, variabel2));	
		}
		else if(val==7){
			System.out.println("Svar "+advanced.inverse(variabel1));
		}
		else if(val==8){
			System.out.println("Svar "+advanced.cos(variabel1));
		}
		else if(val==9){
			System.out.println("Svar "+advanced.sin(variabel1));
		}
		else if(val==10){
			System.out.println("Svar "+advanced.tan(variabel1));
		}
		else if(val==11){
			System.out.println("Svar "+advanced.power(variabel1, variabel2));	
		}
		else{
			System.out.println("Läs användarinstruktionerna bättre");
		}
		
		in.close();
		System.exit(0);

	}

}
