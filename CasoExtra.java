package EjerciciosAvanzados;

import java.util.Scanner;

public class CasoExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * @author Miguel Paniagua
		 * 
		Se pide al usuario que introduzca su año de nacimiento. Solo se permite continuar si el año es menor de 2021. 
		Se mostrará al usuario todos los años que han pasado desde su nacimiento hasta 2022. Por ejemplo, pone 2014, el resultado será: 
		2014-2015-2016-2017-2018-2019-2020-2021-
		*/
		
		int año;

		do {
			Scanner añoInput = new Scanner(System.in);
			System.out.println("Introduce tu año de nacimiento: ");
			año = añoInput.nextInt();

			if (año > 2021) {
				System.out.println("[ERROR] El año debe ser menor de 2021");
			}

		} while (año > 2021);

		for (int i = año; i <= 2022; ++i) {
			System.out.print(i + " ");
		}

	}

}
