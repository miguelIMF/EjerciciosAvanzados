package EjerciciosAvanzados;

import java.util.Scanner;


public class Caso20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Realizar un programa que pida un número entero y calcule su factorial. Si el número introducido es negativo se seguirá pidiendo hasta que sea positivo.  
		Una vez calculado se informará del resultado con el siguiente formato: “El factorial de <número> es <factorial>” 
		Para todo número natural 
		n, se llama 
		factorial de n al producto de todos los naturales desde 1 hasta n. 
		 */
		
		int num1;
		int mul =1;
		
		do {
			Scanner numInput1 = new Scanner(System.in);
			System.out.println("Introduce un numero: ");
			num1 = numInput1.nextInt();

			if (num1 < 0) {
				System.out.println("[ERROR] el numero debe ser positivo");
			}

		} while (num1 < 0);
		
		System.out.print(mul);
		
		for(int i=2;i<=num1;++i) {
			 
			 System.out.print("*"+i);
			 mul = mul*i;
		 }
		 System.out.print("="+mul);
	}

}
