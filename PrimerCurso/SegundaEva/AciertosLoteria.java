package SegundaEva;

import java.util.Arrays;

public class AciertosLoteria {

	public static void main(String[] args) {
		// Definir una función que tome como parámetros dos tablas,
		// la primera con los 6 números de una apuesta de la primitiva,
		// y la segunda (ordenada) con los 6 números de la combinación ganadora. 
		// La función devolverá el número de aciertos
		int apuesta []= {2,4,33,44,23,1};
		int resultado []= {2,5,22,33,35,44};
		int c=comprobar(apuesta,resultado);
		System.out.println("El numero total de aciertos es: "+c);

	}
	static int comprobar (int t[],int p []) {
		int aciertos=0;
		System.out.println("Has acertado:");
		for (int a:t) {
			if (Arrays.binarySearch(p,a) >=0) {
				aciertos++;
				System.out.println(a);
			}
		}
		return aciertos;
		
	}

}