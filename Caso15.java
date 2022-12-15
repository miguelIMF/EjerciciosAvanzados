package EjerciciosAvanzados;

import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * @author Miguel Paniagua
		 * 
		Escribir un programa en java que lea temperaturas en grados 

		Celsius y las transforme a la escala Fahrenheit.  

		La fórmula de transformación es:  

		F=9/5∗C32 

 		Tras cada ejecución, el programa muestra por pantalla el mensaje: “Desea continuar [s/n]”. La ejecución finaliza cuando se responde algo distinto de ‘s’. 
		 */
		
		double tempCelsius;
		double tempFahrenheit;
		String sn;
		
		while(true) {
			Scanner numInput1 = new Scanner(System.in);
			System.out.println("Introduce la temperatura en grados Celsius: ");
			tempCelsius = numInput1.nextInt();
			
			tempFahrenheit= tempCelsius * 1.8 + 32;
			System.out.println("La temperatura en grados Fahrenheit es: " + tempFahrenheit);
			
			Scanner numInput2 = new Scanner(System.in);
			System.out.println("Desea continuar [s/n]");
			sn = numInput2.next();
			
			if (!sn.equals("s")) {
				System.out.println("[FIN]");
				System.exit(0);
			}
		}
	}
}
