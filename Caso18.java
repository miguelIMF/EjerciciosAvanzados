package EjerciciosAvanzados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Caso18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Realizar un programa que lea 30 notas de examen, podrán usarse decimales.
		Se debe comprobar que cada una de ellas está entre 0 y 10,
		si alguna no lo cumple se seguirá pidiendo hasta que sea correcta.
		Calcular la nota media, la más alta y la más baja e informar del resultado por pantalla. 
		 */
		
		float nota;
		ArrayList<Float> notasList = new ArrayList<>();
		int count = 1;
		float sum = 0;

		for (int i = 0; i < 30; ++i) {

			do {
				Scanner numInput1 = new Scanner(System.in);
				System.out.println("Introduce la nota " + count + ": ");
				nota = numInput1.nextFloat();

				if (nota <= 0 || nota > 10) {
					System.out.println("[ERROR] La nota debe estar entre 0 y 10");
				} else {
					notasList.add(nota);
					sum = sum + nota;
				}
			} while (nota <= 0 || nota > 10);

			++count;
		}

		System.out.println("La nota media es: " + sum / notasList.size());
		System.out.println("La mas baja es: " + Collections.min(notasList));
		System.out.println("La mas alta es: " + Collections.max(notasList));
	}

}
