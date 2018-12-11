package calculator_AndersHansson.calculator_AndersHansson;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BasicOperations basic=new BasicOperations();
		AdvancedOperations advanced=new AdvancedOperations();
		double variabel1;
		double variabel2;
		int val;
		Scanner in=new Scanner(System.in);
		System.out.println("Vad är första siffran?");
		String firstnumber=in.next();
		variabel1=Double.parseDouble(firstnumber);
		System.out.println("Vilket räknesätt vill du använda?\n"
				+ "Tryck 1 för plus. 2 för minus. 3 för multiplikation. 4 för division \n"
				+ "5 för rotenur. 6 för modulus. 7 för inversen. 8 för Cos. 9 för Sin. 10 för Tan. 11 för upphöjt till.");
		String raknesatt=in.next();
		val=Integer.parseInt(raknesatt);
		if (val==1){
			System.out.println("Vad är andra siffran?");
			String secondnumber=in.next();
			variabel2=Double.parseDouble(secondnumber);
			System.out.println("Svar "+basic.addition(variabel1, variabel2));
		}
		else if(val==2){
			System.out.println("Vad är andra siffran?");
			String secondnumber=in.next();
			variabel2=Double.parseDouble(secondnumber);
			System.out.println("Svar "+basic.subtraction(variabel1, variabel2));	
		}
		else if(val==3){
			System.out.println("Vad är andra siffran?");
			String secondnumber=in.next();
			variabel2=Double.parseDouble(secondnumber);
			System.out.println("Svar "+basic.multiplication(variabel1, variabel2));	
		}
		else if(val==4){
			System.out.println("Vad är andra siffran?");
			String secondnumber=in.next();
			variabel2=Double.parseDouble(secondnumber);
			System.out.println("Svar "+basic.division(variabel1, variabel2));	
		}
		else if(val==5){
			System.out.println("Svar "+advanced.squrt(variabel1));
		}
		else if(val==6){
			System.out.println("Vad är andra siffran?");
			String secondnumber=in.next();
			variabel2=Double.parseDouble(secondnumber);
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
			System.out.println("Vad är andra siffran?");
			String secondnumber=in.next();
			variabel2=Double.parseDouble(secondnumber);
			System.out.println("Svar "+advanced.power(variabel1, variabel2));	
		}
		else{
			System.out.println("Läs användarinstruktionerna bättre");
		}
		
		in.close();
		System.exit(0);

	}

}
