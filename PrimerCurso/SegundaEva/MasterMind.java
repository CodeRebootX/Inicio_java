package SegundaEva;

import java.util.Arrays;
import java.util.Scanner;

public class MasterMind {
    public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int []jugador1; int [] jugador2; int longitud; String cadena; int cont=0;
		int []acierto1; int []acierto2; int intentos; int muertos; 
		int []contadorM; int []contadorH; int heridos; int []hist1=new int [0];
		int []hist2=new int[0];
		System.out.println("		BIENVENIDO A MASTERMIND");
		espacios(1);
		System.out.println("Introduce longitud de numero que quereis adivinar:");
		longitud=entrada.nextInt();
		System.out.println("Introduce numero de intentos que dispondreis cada uno:");
		intentos=entrada.nextInt();
		int cont_aux=intentos;
		System.out.println("Jugador 1, introduce tu número de "+longitud+" cifras");
		cadena=entrada.next();
		jugador1=introducirNum(cadena,longitud);
		espacios(50);
		System.out.println("Jugador 2, introduce tu número de "+longitud+" cifras");
		cadena=entrada.next();
		jugador2=introducirNum(cadena,longitud);
		espacios(50);
		System.out.println("		¡¡¡¡¡ QUE COMIENCE EL JUEGO !!!!!!");
		espacios(1);
		while (cont<intentos) {
			System.out.println("Turno jugador 2, introduce un número:");
			cadena=entrada.next();
			acierto1=introducirNum(cadena,longitud);
			hist1=Historial(hist1,acierto1);
			contadorM=Muertos(jugador1,acierto1);
			muertos=contadorM(contadorM);
			//System.out.println("Tienes "+muertos+" muertos");
			contadorH=Heridos(contadorM,acierto1);
			heridos=contadorH(contadorH);
			cont_aux--;
			System.out.println("Tienes "+muertos+" muertos y "+heridos+" heridos");
			System.out.println("Te quedan "+cont_aux+" intentos");
			espacios(3);
			if (muertos==longitud) {
				System.out.println("No te hace falta mas intentos!!!!");
				System.out.println("Enhorabuena, has acertado el número");
				cont=intentos+1;
			} else {
				System.out.println("Turno jugador1, introduce un número:");
				cadena=entrada.next();
				acierto2=introducirNum(cadena,longitud);
				hist2=Historial(hist2,acierto2);
				contadorM=Muertos(jugador2,acierto2);
				muertos=contadorM(contadorM);
				//System.out.println("tienes "+muertos+" muertos");
				contadorH=Heridos(contadorM,acierto2);
				heridos=contadorH(contadorH);
				System.out.println("Tienes "+muertos+" muertos y "+heridos+" heridos");
				System.out.println("Te quedan "+cont_aux+" intentos");
				espacios(3);
				if (muertos==longitud) {
					System.out.println("No te hace falta mas intentos!!!!");
					System.out.println("Enhorabuena, has acertado el número");
					cont=intentos+1;
				}
			}
			cont++;	
			if (cont==intentos) {
				System.out.println("Ninguno es el ganador,la proxima vez será.");
			}
		}
		
		System.out.println("Jugador 1 introdujo los siguientes numeros: "+Arrays.toString(hist1));
		System.out.println("Jugador 2 introdujo los siguientes numeros: "+Arrays.toString(hist2));
		entrada.close();
		
	}
	
	static int []Muertos(int []a,int[]b) {
		int []k=new int[a.length];
		for (int i=0;i<a.length;i++) {
		if(a[i]==b[i]) {
			k[i]=-1;
			}	
		}
		System.out.println(Arrays.toString(k));
		return k;
	}
	
	static int []Heridos(int []a,int[]b) {
		int []j=new int [a.length]; int posicion; int []k=new int[a.length];

		j=Arrays.copyOf(a,a.length);
		k=Arrays.copyOf(a,a.length);
		Arrays.sort(j);
		for (int i=0;i<a.length;i++) {
		posicion=Arrays.binarySearch(j,b[i]);
			if (posicion>=0) {
				if(a[i]!=b[i]) {
					k[posicion]=-2;
				}
			}	
		}
		return k;
	}
	
	static int contadorH (int[]a) {
		int cont=0; 
		for (int i=0;i<a.length;i++) {
			if(a[i]==-2) {
				cont++;
			}
		}
		return cont;
	}
	
	static int contadorM (int[]a) {
		int cont=0; 
		for (int i=0;i<a.length;i++) {
			if(a[i]==-1) {
				cont++;
			}
		}
		return cont;
	}
	
	static int []Historial (int[]a,int []b) {
		int []resultado=new int [a.length+b.length];
		System.arraycopy(a,0,resultado,0,a.length);
		System.arraycopy(b,0,resultado,a.length,b.length);
		return resultado;
	}
		
	static int []introducirNum (String texto, int tamaño) {
		Scanner entrada=new Scanner(System.in);
		int []tabla=new int [tamaño];
		while (tamaño!=texto.length()){
			System.out.println("El número introducido no es de "+tamaño+" cifras, vuelve a introducirlo:");
			texto=entrada.next();
		}
		for (int i=0;i<texto.length();i++) {
			tabla[i]= numero (texto.charAt(i));
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
	static void espacios (int a) {
		for (int i=0;i<=a;i++) {
			System.out.println();
		}
	}
}
