package EjerciciosAvanzados;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Caso28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * @author Miguel Paniagua
		 * 
		Un amigo me pide dinero y me dice que me lo va a devolver en un año a plazos.
		Pedimos la cantidad de dinero y mostramos la cuota de cada mes. Por ejemplo, nos pide 12000€, debemos mostrar: 
		Enero: 1000 
		Febrero: 1000 
		Marzo: 1000 
		Resto de meses… 
		Diciembre: 1000 
		*/
		
		float prestamo;
		float cuotaMes;
		List<String> meses = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre");

		Scanner prestamoInput = new Scanner(System.in);
		System.out.println("Introduce la cantidad del prestamo: ");
		prestamo = prestamoInput.nextFloat();

		cuotaMes = prestamo / 12;
		System.out.println("La cuota por mes es: ");

		for (int i = 0; i < 12; ++i) {
			System.out.println(meses.get(i) + " -> " + cuotaMes + "€");
		}
	}

}
