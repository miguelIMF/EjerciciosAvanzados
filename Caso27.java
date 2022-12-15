package EjerciciosAvanzados;

import java.util.ArrayList;
import java.util.Scanner;

public class Caso27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Una pareja tiene 3 hijos, se piden sus nombres y edades por orden de mayor a menor. Calcula la edad media. 
		Calcula la diferencia de edad entre herman@s. Por ejemplo: 
		Isabela: 20 
		Luisa: 16 
		Mirabel: 10 
		El resultado es: “Isabela es 4 años mayor que luisa, Luisa es 6 años mayor que Mirabel” 
		*/
		
		ArrayList<String> nombresList = new ArrayList<>();
		ArrayList<Integer> edadList = new ArrayList<>();

		for (int i = 0; i < 3; ++i) {

			Scanner nombreInput = new Scanner(System.in);
			System.out.println("Introduce el nombre del niño/a: ");
			nombresList.add(nombreInput.next());

			Scanner edadInput = new Scanner(System.in);
			System.out.println("Introduce la edad del niño/a: ");
			edadList.add(edadInput.nextInt());
		}

		System.out.print("El resultado es: ");
		System.out.print(nombresList.get(0) + " es " + (edadList.get(0) - edadList.get(1)) + " años mayor que "
				+ nombresList.get(1) + ", ");
		System.out.print(nombresList.get(1) + " es " + (edadList.get(1) - edadList.get(2)) + " años mayor que "
				+ nombresList.get(2));
	}

}
