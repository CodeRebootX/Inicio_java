package PrimeraEva;

import java.util.Scanner;

public class FactorialRecursiva {
    public static void main(String[] args) {
        //Cálculo factorial de un número utilizando funcion recursiva
		int num; long resul;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero para conocer su factorial");
		num=entrada.nextInt();
		resul=factorial (num);
		System.out.println(resul);
        entrada.close();
	}
	static long factorial (int num) {
		long resultado;
		if (num==0) {
			resultado=1;
		}
		else {
			resultado=num*factorial(num-1);
		}
		return resultado;
	}
}
