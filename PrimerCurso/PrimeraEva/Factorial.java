package PrimeraEva;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int num; int factorial=1;
		System.out.println("Introduce un valor del que quieres obtener el factorial");
		num=entrada.nextInt();
		for (int i=num;i>0;i--) {
	
			System.out.println(i);
			factorial=factorial*i;
		}
		System.out.println(factorial);
        entrada.close();
	}
}
