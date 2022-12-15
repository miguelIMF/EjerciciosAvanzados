package EjerciciosAvanzados;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Caso12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
		Realizar un programa en Java que lea una secuencia de números y determine cual
		es el mayor de ellos y el número de veces que aparece.
		Cada vez que se introduce un número se debe preguntar “Se desea continuar (s /n)”.
		La ejecución se terminará siempre que el usuario pulse algo distinto de s. 
		 */
		
		int num1;
		int num2;
		ArrayList<Integer> numsList = new ArrayList<>();
		int numMax;
		int nMax;
		String sn;

		Scanner numInput1 = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		num1 = numInput1.nextInt();
		numsList.add(num1);

		while (true) {

			Scanner inputClose = new Scanner(System.in);
			System.out.println("Se desea continuar (s /n): ");
			sn = inputClose.nextLine();
			System.out.println(sn);

			if (!sn.equals("s")) {
				System.out.println("[FIN]");
				System.exit(0);
			}

			Scanner numInput = new Scanner(System.in);
			System.out.println("Introduce otro numero: ");
			num2 = numInput.nextInt();
			numsList.add(num2);

			numMax = Collections.max(numsList);
			nMax = Collections.frequency(numsList, numMax);

			System.out.println(numsList);
			System.out.println("El numero maximo es: " + numMax);
			System.out.println("Se repite " + nMax + " veces");
		}
	}
}
