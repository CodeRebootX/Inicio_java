package SegundaEva;

import java.util.Arrays;
import java.util.Scanner;

public class CamaraSecreta {
    public static void main(String[] args) {
		/* Desarrollar el juego "la cámara secreta" que consiste en abrir una cámara mediante su combinación secreta,
		 * que está formada por una combinación de dígitos de uno al cinco. 
		 * El jugador especificará cuál es la longitud de la combinación, a mayor longitud,
		 * mayor será la dificultad del juego. La aplicación genera de forma aleatoria una combinación secreta
		 *  que el usuario tendrá que acertar. En cada intento se muestra como pista,
		 *  para cada dígito de la combinación introducido si es mayor, menor o igual que el correspondiente en la combinación secreta
		 */
		Scanner entrada=new Scanner (System.in);
		String cadena;
		System.out.println("Introduce longitud de combinacion:");
		int longitud=entrada.nextInt();
		int []comb1=new int [longitud];
		for (int i=0;i<comb1.length;i++) {
			comb1[i]=(int)(Math.random()*5+1);
		}
		System.out.println("La combinación a adivinar se ha generado!\nSon números comprendidos entre 1 y 5\n");
		int []comb2=new int [longitud];
		int []aux=new int [longitud];
		boolean iguales=false;
		iguales=Arrays.equals(comb1, comb2);
		while (!iguales)	{
			System.out.println("Introduce combinación, recuerda será de "+longitud+" cifras:");
			System.out.println();
			cadena=entrada.next();
			comb2=numJug(cadena,longitud);
			aux=muestraPistas(comb1,comb2,aux);
			System.out.println("Se va formando tu combinacion");
			System.out.println(Arrays.toString(aux));
			System.out.println();
			iguales=Arrays.equals(comb1, comb2);
			
		}
		System.out.println("Has abierto la camara secreta!!!!!");
        entrada.close();
	}
	static int [] muestraPistas (int []a, int[]b, int []c) {
		for (int i=0;i<a.length;i++) {
			if (a[i]==b[i]) {
				System.out.println("El dígito "+(i+1)+" haz acertado");
				c[i]=b[i];
			}
			if (a[i]>b[i]) {
				System.out.println("El dígito "+(i+1)+" es mayor");
			}
			if (a[i]<b[i]) {
				System.out.println("El dígito "+(i+1)+" es menor");
			}
		}
		return c;
	}
	static int []numJug (String texto, int tamaño) {
		Scanner entrada=new Scanner(System.in);
		int []tabla=new int [tamaño];
		while (tamaño!=texto.length()){
			System.out.println("El número introducido no es de "+tamaño+" cifras, vuelve a introducirlo:");
			texto=entrada.next();
		}
		for (int i=0;i<texto.length();i++) {
			tabla[i]= numero(texto.charAt(i));
		}
        entrada.close();
		return tabla;
	}
	static int numero (char a) {
		int num=-1;
		if (a==48) {
			num=0;
		}
		if (a==49) {
			num=1;
		}if (a==50) {
			num=2;
		}if (a==51) {
			num=3;
		}if (a==52) {
			num=4;
		}if (a==53) {
			num=5;
		}if (a==54) {
			num=6;
		}if (a==55) {
			num=7;
		}if (a==56) {
			num=8;
		}if (a==57) {
			num=9;
		}
		return num;
		
	}
}
