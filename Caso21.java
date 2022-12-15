package EjerciciosAvanzados;


import java.util.Scanner;
import java.util.List;
import java.util.Arrays;


public class Caso21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * @author Miguel Paniagua
		 * 
		
		Escribir un programa que pida un número entero que representa un día de la semana
		y escriba un mensaje por pantalla dependiendo del valor del número:  
		Debe mostrar si es día laborable o fin de semana.
		Debe mostrar el nombre del día de la semana. 
		Por ejemplo: 
		Introduce un 2, el resultado es: 
		“Es un día laborable” 
		“Es martes” 
		
		 */
		
		int num1;
		List<String> diasSemana = Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");
		
		do {
			Scanner numInput1 = new Scanner(System.in);
			System.out.println("Introduce un dia de la semana en numero: ");
			num1 = numInput1.nextInt();

			if (num1 < 1 || num1 > 7) {
				System.out.println("[ERROR] El numero debe ser entre 1 y 7");
			}
			
		} while (num1 < 1 || num1 > 7);
		
		if(num1<=5) {
			System.out.println("Es un día laborable");
		} else {
			System.out.println("Es un día de fin de semana");
		}
		
		System.out.println("Es "+diasSemana.get(num1-1));
		
		

	}

}
