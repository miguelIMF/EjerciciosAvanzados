package EjerciciosAvanzados;

import java.util.Scanner;

public class Caso26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		El programa pide la edad al usuario, debe ser superior a 10 e inferior a 100. En caso contrario sale un error. 
		Muestra el año de nacimiento (de manera simple) del usuario en función de su edad. 
		Por ejemplo, si tiene 10 años y estamos en 2022, su año de nacimiento podría ser 2012. 
		 */
		
		int edad;

		do {
			Scanner edadInput = new Scanner(System.in);
			System.out.println("Introduce tu edad: ");
			edad = edadInput.nextInt();

			if (edad < 10 || edad > 100) {
				System.out.println("[ERROR] La edad debe ser entre 10 y 100");
			}

		} while (edad < 10 || edad > 100);

		System.out.println("Su año de nacimiento podria ser: " + (2022 - edad));

	}
}
