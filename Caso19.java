package EjerciciosAvanzados;

import java.util.ArrayList;
import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * @author Miguel Paniagua
		 * 
		Realizar un programa que pida dos números enteros positivos,
		si los números introducidos no son positivos se seguirán pidiendo hasta que lo sean.  
		Calcular su producto mediante sumas e informar por pantalla del resultado.  
		Por ejemplo: si los números son 3 y 6, las siguientes operaciones serían equivalentes:  
 		3*6  
    	3 + 3 + 3 +3 + 3 + 3  
    	6+ 6+ 6 
		 */
		
		int num1;
		int num2;
		String calc1;
		String calc2;
		int sum1;
		int sum2;


		do {
			Scanner numInput1 = new Scanner(System.in);
			System.out.println("Introduce el primer numero: ");
			num1 = numInput1.nextInt();

			if (num1 < 0) {
				System.out.println("Eror el numero debe ser positivo");
			}

		} while (num1 < 0);
		
		do {
			Scanner numInput2 = new Scanner(System.in);
			System.out.println("Introduce el primer numero: ");
			num2 = numInput2.nextInt();

			if (num2 < 0) {
				System.out.println("Eror el numero debe ser positivo");
			}

		} while (num2 < 0);
		
		calc1 = Integer.toString(num1);
		sum1 = num1;
		System.out.println(num1+"*"+num2);
		
		for(int i = 2; i<=num2 ;++i) {
			
			calc1 = calc1 +"+"+num1;
			sum1 = sum1+num1;
		}
		
		System.out.println(calc1+"="+sum1);
		
		calc2 = Integer.toString(num2);
		sum2 = num2;
		
		for(int i = 2; i<=num1 ;++i) {
			
			calc2 = calc2 +"+"+num2;
			sum2 = sum2+num2;
		}
		
		System.out.println(calc2+"="+sum2);
		
	}

}