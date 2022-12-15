package EjerciciosAvanzados;

import java.util.ArrayList;
import java.util.Scanner;

public class Caso22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * @author Miguel Paniagua
		 * 
		Escribir un programa que pida el nombre de 3 productos y sus precios. 
		Pedirá la cantidad de dinero que tiene el usuario. 
		Mostrará si el usuario puede comprar los tres productos con el dinero que tiene. 
		 */
		
		ArrayList<String> productosList = new ArrayList<>();
		ArrayList<Float> preciosList = new ArrayList<>();
		float dinero;
		float precioSum = 0;

		for (int i = 0; i < 3; ++i) {

			Scanner prodInput = new Scanner(System.in);
			System.out.println("Introduce el nombre de producto: ");
			productosList.add(prodInput.next());

			Scanner precInput = new Scanner(System.in);
			System.out.println("Introduce el precio del producto: ");
			preciosList.add(precInput.nextFloat());
		}

		Scanner dineroInput = new Scanner(System.in);
		System.out.println("Introduce la cantidad de dinero que tienes: ");
		dinero = dineroInput.nextFloat();

		for (int i = 0; i < productosList.size(); ++i) {

			System.out.println(productosList.get(i) + ": " + preciosList.get(i) + " €");
			precioSum = precioSum + preciosList.get(i);
		}

		System.out.println("Tienes " + dinero + " €");
		System.out.println("El total de la compra cuesta " + precioSum + " €");

		if (dinero >= precioSum) {
			System.out.println("Puedes comprar los productos");
		} else {
			System.out.println("No puedes comprar los productos");
		}
	}
}
