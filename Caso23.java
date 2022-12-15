package EjerciciosAvanzados;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Escribir un programa que pida una fila y una columna e informe si las coordenadas contienen “X” o no. 
		Por ejemplo, se da la fila 1 y la columna 2. El resultado es “No hay X” 
		Por ejemplo, se da la fila 2 y la columna 2. El resultado es “Hay X” 
		 */
		
		int fila;
		int columna;
		String resultado = "";

		List<String> fila1 = Arrays.asList("x", "-", "-");
		List<String> fila2 = Arrays.asList("-", "x", "-");
		List<String> fila3 = Arrays.asList("-", "-", "x");

		Scanner filaInput = new Scanner(System.in);
		System.out.println("Introduce un numero de fila entre 1 y 3: ");
		fila = filaInput.nextInt();

		Scanner columnaInput = new Scanner(System.in);
		System.out.println("Introduce un numero de columna entre 1 y 3: ");
		columna = columnaInput.nextInt() - 1;

		switch (fila) {

			case 1:
				resultado = fila1.get(columna);
				break;
			case 2:
				resultado = fila2.get(columna);
				break;
			case 3:
				resultado = fila3.get(columna);
				break;
		}

		if (resultado == "x") {
			System.out.println("El resultado es: Hay X");
		} else {
			System.out.println("El resultado es: No hay X");
		}
	}
}
