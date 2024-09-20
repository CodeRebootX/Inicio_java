package SegundaEva;

import java.util.Arrays;
import java.util.Scanner;

public class CampeonatoProgramacion {
    public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		System.out.println("***RESULTADOS DE LOS 5 PARTICIPANTES DEL CAMPEONATO***");
		int puntos []= new int [5];
		for (int i=0;i<5;i++) {
			System.out.print("Puntos programador ("+(i+1)+"): ");
			puntos[i]=entrada.nextInt();
		}
		Arrays.sort(puntos);
		System.out.println("Puntuacion ordenada: "+Arrays.toString(puntos));
		System.out.print("\nProgramadores de exhibición (introduce -1 para terminar)\n\nPuntos del programador de exhibición: ");
		int puntosProgExh=entrada.nextInt();
		while (puntosProgExh!=-1) {
			int indiceInsercion=Arrays.binarySearch(puntos, puntosProgExh);
			
			if (indiceInsercion<0) {
				indiceInsercion=-indiceInsercion-1;
			}
			//Creamos una tabla auxiliar para introducir de manera ordenada la nueva puntuación
			int puntos_aux[]=new int [puntos.length+1];
			System.arraycopy(puntos,0,puntos_aux,0,indiceInsercion);
			System.arraycopy(puntos,indiceInsercion,puntos_aux,indiceInsercion+1,puntos.length-indiceInsercion);
			puntos_aux[indiceInsercion]=puntosProgExh;
			puntos=puntos_aux;
			System.out.print("Puntos de programador de exhibición: ");
			puntosProgExh=entrada.nextInt();
		}
		System.out.print("\nPuntuación final de todos los participantes: "+Arrays.toString(puntos));
        entrada.close();
	}
}
