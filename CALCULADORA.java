package ejercicio_Antonio;

import java.util.Scanner;

public class CALCULADORA {

	
	public static void menu() { // Creo la funcion menu donde muestro las opciones y donde le pido al ususario que introduzca los numeros
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		double num1 = teclado.nextDouble();

		System.out.print("Introduce el segundo número: ");
		double num2 = teclado.nextDouble();

		System.out.println("===== CALCULADORA =====");
		System.out.println(" + ");
		System.out.println(" - ");
		System.out.println(" * ");
		System.out.println(" / ");
		System.out.print("Elige una opción: ");
		int opcion = teclado.nextInt();

		switch (opcion) { //Creacion del funcionamiento del menu mediante un switch y diversos breaks para separar las opciones
		case 1:
			System.out.println("Resultado: " + sumar(num1, num2));
			break;

		case 2:
			System.out.println("Resultado: " + restar(num1, num2));
			break;

		case 3:
			System.out.println("Resultado: " + multiplicar(num1, num2));
			break;

		case 4:
			System.out.println("Resultado: " + dividir(num1, num2));
			break;

		default: // En caso de que el ususario introduzca un caracter le salta el aviso
			System.out.println("Opción no válida");
			teclado.close();
		}
	}
	
	//Creo las funciones donde le doy los parametros a y b que en este caso son los numeros que a introducido el ususario.
	//Mediante el uso del return muestro por pantalla el resultado de las operaciones dependiendo de cual sea la operacion que necesita el ususario hacer 

	public static double sumar(double a, double b) {
		return a + b;
	}

	public static double restar(double a, double b) {
		if (a > b) {
			return a - b;
		} else {
			return b - a;
		}

	}

	public static double multiplicar(double a, double b) {
		return a * b;
	}

	public static double dividir(double a, double b) {
		if (b == 0) {
			System.out.println("Error: no se puede dividir entre 0");
			return 0;
		}
		return a / b;
	}

	public static void main(String[] args) {
		menu();
	}
}