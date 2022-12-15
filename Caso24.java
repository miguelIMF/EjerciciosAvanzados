package EjerciciosAvanzados;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Caso24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * @author Miguel Paniagua
		 * 
		Se pide al usuario su cantidad de sueldo bruto anual. 
		Se informa de la cantidad a cobrar al mes si tiene 12 pagas. Por ejemplo, para un sueldo de 12000€ debe salir: 		
		Enero: 1000 
		Febrero: 1000 
		Marzo: 1000 
		Resto de meses… 
		Diciembre: 1000 
		 */
		
		float bruto;
		float sueldoMes;
		List<String> meses = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre");

		Scanner brutoInput = new Scanner(System.in);
		System.out.println("Introduce el salario bruto anual: ");
		bruto = brutoInput.nextFloat();

		sueldoMes = bruto / 12;
		System.out.println("El sueldo por mes es: ");

		for (int i = 0; i < 12; ++i) {
			System.out.println(meses.get(i) + " -> " + sueldoMes + "€");
		}
	}
}
