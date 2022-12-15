package EjerciciosAvanzados;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Caso11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Realizar un programa que lea una secuencia de números,
		 se terminará de recoger números cuando el usuario introduzca un 0. 
		  Mostrar por pantalla su suma, su producto y su media.  
		 Deberás tener cuidado si el primer número introducido es un 0,
		 nose habrá introducido ningún número y al calcular la media, recuerda que la división por cero no existe. 
		 */
		
		int num1;
		int num2;
		ArrayList<Integer> numsList = new ArrayList<>();
		int sum;
		int mul;
		float avg;
		int inum;

		do {
			Scanner numInput1 = new Scanner(System.in);
			System.out.println("Introduce un numero: ");
			num1 = numInput1.nextInt();
			if (num1 == 0) {
				System.out.println("[FIN]");
				System.exit(0);
			} else {
				numsList.add(num1);
			}
		} while (num1 == 0);

		while (true) {
			Scanner numInput2 = new Scanner(System.in);
			System.out.println("Introduce otro numero: ");
			num2 = numInput2.nextInt();

			if (num2 == 0) {
				System.out.println("[FIN]");
				System.exit(0);
			} else {

				numsList.add(num2);
				System.out.println(numsList);

				sum = 0;
				mul = 1;
				avg = 0;

				for (int i = 0; i < numsList.size(); i++) {

					sum += numsList.get(i);
					mul *= numsList.get(i);
					avg = sum / numsList.size();
				}

				System.out.println("La suma es: " + sum);
				System.out.println("El producto es: " + mul);
				System.out.println("La media es: " + avg);
			}
		}
	}
}
		
	
