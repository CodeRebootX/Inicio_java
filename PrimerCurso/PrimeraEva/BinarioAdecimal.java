package PrimeraEva;

import java.util.Scanner;
public class BinarioAdecimal {
	public static void main(String[] args) {
		Scanner entrada =new Scanner (System.in);
		String cadena; int resultado;
		System.out.println("Introduce el numero binario");
		cadena=entrada.next();
		resultado=convertir(cadena);
		System.out.println("El número que has introducido en base decimal es: "+resultado);
        entrada.close();
	}
	static int decimal (char a) {
		int num=0;
		if (a==48) {
			num=a-48;
		}
		if (a==49) {
			num=a-48;
		}
		return num;
	}
	static int potencia (int b, int e) {
		int resultado=1;
		for (int i=0;i<e;i++) {
			resultado=resultado*b;
		}
		return resultado;
	}
	static int convertir (String cadena) {
		int exp=0;int result=0; int num;
		for (int i=((cadena.length())-1);i>=0;i--) {
			num=decimal(cadena.charAt(i))*potencia (2,exp);
			exp++;
			result=result+num;
		}
		return result;	
	}
}