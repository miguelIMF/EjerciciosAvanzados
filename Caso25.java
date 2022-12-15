package EjerciciosAvanzados;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Caso25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Se pide al usuario un día (1-7) y un turno (mañana o tarde). 
		El programa dice a quién le toca el turno ese día: 
		 */
		
		int dia;
		String turno="";
		List<String> mañanas= Arrays.asList("Pepe","Lola","Pepe","Lola","Pepe","Lola","Pepe");
		List<String> tardes= Arrays.asList("Lola","Pepe","Lola","Pepe","Lola","Pepe","Lola");

		Scanner diaInput = new Scanner(System.in);
		System.out.println("Introduce un dia de la semana (1-7): ");
		dia = diaInput.nextInt();

		Scanner turnoInput = new Scanner(System.in);
		System.out.println("Introduce turno (mañana o tarde): ");
		turno = turnoInput.next();
		
		if(turno.equals("mañana")) {
			System.out.println("El turno es de: "+mañanas.get(dia-1));
		}
		if(turno.equals("tarde")) {
			System.out.println("El turno es de: "+tardes.get(dia-1));
		}

	}

}
