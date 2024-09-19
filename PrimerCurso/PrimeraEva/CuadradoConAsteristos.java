package PrimeraEva;

import java.util.Scanner;

public class CuadradoConAsteristos {
    	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		System.out.println("Introduce tamaño de cuadrado");
		int n=entrada.nextInt();
		System.out.println("Aqui tienes tu cuadrado formado por "+n+" asteriscos por cada lado:");
		System.out.println();
		for (int i=n; i>0;i--) {
			for (int b=n;b>0;b--) {
				System.out.print("* ");
			}
			System.out.println();
		}
        entrada.close();
	}
}
