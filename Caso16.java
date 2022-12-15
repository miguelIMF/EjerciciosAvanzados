package EjerciciosAvanzados;

public class Caso16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa que muestre por pantalla las secuencias:
		 * 
		 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 
		 * 1 3 5 7 9 11 13 15 17 19 
		 * 5 10 15 20 25 30 35 40 45 50 
		 * 100 90 80 70 60 50 40 30 20 10 0 
		 * 2 4 6 10 12 14 18 20 22 26 
		 */

		for (int i = 1; i <= 20; ++i) {
			System.out.print(i + " ");
		}

		System.out.print("\n");

		for (int i = 1; i <= 20; ++i) {

			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

		System.out.print("\n");

		for (int i = 5; i <= 50; i += 5) {

			System.out.print(i + " ");
		}

		System.out.print("\n");

		for (int i = 100; i >= 0; i -= 10) {

			System.out.print(i + " ");
		}

		System.out.print("\n");

		for (int i = 2; i <= 26; ++i) {

			if (i % 2 == 0 && i % 8 != 0) {
				System.out.print(i + " ");
			}
		}

		System.out.print("\n");

	}
}
