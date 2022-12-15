package EjerciciosAvanzados;

import java.util.ArrayList;
import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Realizar un programa en java que calcule e imprima la suma de los múltiplos
		de 2 comprendidos entre dos valores a y b que pedirá por pantalla.  
		No se debe permitir que se introduzcan valores negativos para a y b.
		Se deberá controlar que a < b. Si a > b se intercambiarán estos valores 
		 */
		
		int num1 = 0;
		int num2 = 0;
		int imul;
		int sum = 0;
		ArrayList<Integer> numList = new ArrayList<>();

		do {
			Scanner numInput1 = new Scanner(System.in);
			System.out.println("Introduce el primer numero: ");
			numList.add(numInput1.nextInt());

			if (numList.get(0) < 0) {
				System.out.println("Eror el numero debe ser positivo");
			}

		} while (numList.get(0) < 0);

		do {
			Scanner numInput2 = new Scanner(System.in);
			System.out.println("Introduce el segundo numero: ");
			numList.add(numInput2.nextInt());

			if (numList.get(0) < 0) {
				System.out.println("Eror el numero debe ser positivo");
			}

		} while (numList.get(1) < 0);

		// Si num1 es mayor que num2 se altera el orden
		if (numList.get(0) > numList.get(1)) {
			num1 = numList.get(1);
			num2 = numList.get(0);
		} else {
			num1 = numList.get(0);
			num2 = numList.get(1);
		}

		System.out.println("El primero numero introducido es: " + num1);
		System.out.println("El segundo numero introducido es: " + num2);

		if (num1 % 2 == 0) {
			imul = num1 / 2;
		} else {
			imul = (num1 + 1) / 2;
		}

		for (int i = imul; i <= num2 / 2; ++i) {
			System.out.println(2 * i);
			sum += 2 * i;
		}

		System.out.println("La suma de los multiplos entre " + num1 + " y " + num2 + " es: " + sum);
	}
}
