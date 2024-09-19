package PrimeraEva;

import java.util.Scanner;

public class DatoPar {
    public static void main(String[] args) {
		// Desarrolla un programa que mientras que los datos introducidos por consola sean pares muestre un mensaje: "número par",
		//hasta que el dato introducido sea impar en el que mostrará el mensaje: "dato impar, fin del programa".
		Scanner entrada=new Scanner (System.in);
		int num;
		do {
			System.out.println("Introduce un número:");
			num=entrada.nextInt();
			if (num%2==0) {
				System.out.println("\n El número introducido es par \n");
			}
			
		} while ((num%2)==0);
		System.out.println("\n Número impar, hemos terminado.");
		entrada.close();
	}
}
