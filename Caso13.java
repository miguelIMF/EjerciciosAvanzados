package EjerciciosAvanzados;

import java.util.ArrayList;
import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Realizar un programa en java que realice las siguientes acciones:  
		Pida el número de alumnos de una clase, debe comprobarse que la cifra está entre 5 (mínimo) y 30  
		(máximo).  
 		Pida tantas notas como alumnos hay en la clase, las notas son enteros entre 0 y 10  
		Informe por pantalla del número de aprobados (nota >=5) y suspensos (nota<5). 
		 */

		int nAlumnos;
		ArrayList<Integer> suspensosList = new ArrayList<>();
		ArrayList<Integer> aprobadosList = new ArrayList<>();
		int nota;
		int count = 1;

		Scanner alumnInput = new Scanner(System.in);
		System.out.println("Introduce el numero de alunos: ");
		nAlumnos = alumnInput.nextInt();

		for (int i = 0; i < nAlumnos; ++i) {

			do {

				Scanner notaInput = new Scanner(System.in);
				System.out.println("Introduce la nota " + count + ":");
				nota = notaInput.nextInt();

				if (nota < 0 || nota > 10) {
					System.out.println("Eror, la nota debe estar entre 0 y 10");
				}
				if (nota >= 5 && nota <= 10) {
					aprobadosList.add(nota);
				}
				if (nota >= 0 && nota < 5) {
					suspensosList.add(nota);
				}
			}

			while (nota < 0 || nota > 10);
			++count;
		}

		System.out.println("Numero de aprobados: " + aprobadosList.size());
		System.out.println("Numero de suspensos: " + suspensosList.size());

	}
}
