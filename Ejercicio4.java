import java.util.*;
public class Ejercicio4{
	public static void main(String args[]){

		Scanner read = new Scanner(System.in);

		int edad;
		int mayor=0;
		int menor=100;

		for (int i = 0; i < 20 ;i++ ) {

			System.out.println("ingrese edad");
			edad = read.nextInt();

			if (edad>mayor) {
				mayor = edad;
			}

			if (edad<menor) {
				menor = edad;
			}
		}

		System.out.println("mayor edad "+mayor);
		System.out.println("menor edad "+menor);

	}
}