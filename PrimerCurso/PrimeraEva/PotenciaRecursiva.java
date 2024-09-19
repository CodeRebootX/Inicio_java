package PrimeraEva;

import java.util.Scanner;

public class PotenciaRecursiva {
    public static void main(String[] args) {
		Scanner entrada =new Scanner (System.in);
		System.out.println("Introduce base:");
		long b=entrada.nextInt();
		System.out.println("introduce exponente (no negativo):");		
		int e=entrada.nextInt();
		long resultado=potencia(b,e);	
		System.out.println(b+"^"+e+"="+resultado);
        entrada.close();	
	}
	static long potencia (long b, int e) {
		long resultado;
		if (e==0) {
			resultado = 1;
		}
		else {
			resultado = b*potencia(b,(e-1));
		}
		return resultado;
	}
}
