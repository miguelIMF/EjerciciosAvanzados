package EjerciciosAvanzados;

public class Caso17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * @author Miguel Paniagua
		 * 
		Realizar un programa que muestre por pantalla la secuencia:  
		1 3 5 7 9 11 13 15 17 19  
		Primero de la secuencia Mi número de la suerte  
		No soy supersticioso Último de la secuencia 
		 */
		int num1 = 1;
		int num2 = 19;

		for (int i = num1; i <= num2; ++i) {

			if (i % 2 != 0) {
				System.out.print(i + " ");

				if (i == num1) {
					System.out.print("Mi número de la suerte ");
				}
				if (i == num2) {
					System.out.print("No soy supersticioso");
				}
			}
		}
	}
}
