package TerceraEva.arrayList;

import java.util.Scanner;

public class Main2 {
    	public static void main(String[] args) {
		/*Utilizando la lista anterior , escribir un programa en el que se encolen números enteros
		 * introducidos por teclado, hasta que se introduzca uno negativo.
		 * A continuación desencolarlos todos a medida que se muestran por pantalla.
		 */
		Scanner entrada = new Scanner (System.in);
		Integer num=0;
		Lista a =new Lista();
		System.out.println("Introduce número a encolar");
		num=entrada.nextInt();
		while (num>=0) {
			a.encolar(num);
			System.out.println("Introduce número a encolar");
			num=entrada.nextInt();
			
		}
	
		a.mostrar();
		Integer prueba=a.desencolar();
		System.out.println(prueba);
		
		while (prueba!=null) {
			prueba=a.desencolar();
			System.out.println(prueba);
		}
		
		/* Implementar un programa en el que usando una cola anónima se encolan números enteros
		 * hasta que se introduce un valor negativo.Luego se desencolan todos los valores
		 * mostrándolos por pantalla.
		 * 
		 * En vez de implementar la cola en una lista, construye una lista dentro de la clase anónima
		 * y úsala para guardar en ella los elementos insertados
		 */
		ICola anon = new ICola() {
			Lista b=new Lista();
			public void encolar (Integer a){
				b.encolar(a);
			}
			
			public Integer desencolar() {
				Integer a=b.desencolar();
				return a;
			}
		};
		
		System.out.println("Introduce número a encolar");
		num=entrada.nextInt();
		while (num>=0) {
			anon.encolar(num);
			System.out.println("Introduce número a encolar");
			num=entrada.nextInt();
			
		}
	
		a.mostrar();
		Integer prueba2=anon.desencolar();
		System.out.println(prueba2);
		
		while (prueba2!=null) {
			prueba2=anon.desencolar();
			System.out.println(prueba2);
		}
        entrada.close();
        }
}
