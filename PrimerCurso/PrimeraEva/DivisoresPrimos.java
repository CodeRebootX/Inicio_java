package PrimeraEva;

import java.util.Scanner;

public class DivisoresPrimos {
    public static void main(String[] args) {
		//Escribir una función a la que se le pase un número entero
		//y devuelva el número de divisores primos que tiene.
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el numero:");
		int numero=entrada.nextInt();
            System.out.println("Los divisores primos de "+numero+" es/son: \n");
            divisoresPrimos(numero);
            System.out.println();
        entrada.close();
	}
	static void divisoresPrimos (int numero) {
		boolean aux=true; int cont=0;
		for (int i=1;i<=numero;i++) {
			if (numero%i==0) {
				aux=esPrimo(i);		
				if (aux) {				
					System.out.println(i);
					cont++;
				}
			}
		}
        System.out.println();
		System.out.println("El "+numero+" tiene "+cont+" divisores primos.");
		System.out.println();
	}
	static boolean esPrimo (int numero) {
		boolean primo=true;
		for (int i=2;i<numero;i++) {
			if (numero%i==0) {
				primo=false;
			}
		}
		return primo;
	}
}
