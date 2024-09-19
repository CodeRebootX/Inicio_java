package PrimeraEva;

import java.util.Scanner;

public class ColiseoRomano {
    public static void main(String[] args) {
        /*Diseña un juego donde aleatoriamente se generara una altura de golpe, cuyo daño sea 
         *también aleatorio (hasta 30 puntos), cada luchador empieza con 100 puntos y deberá elegir
         *la defensa (altura) para detener el golpe, si realiza 3 paradas consecutivas recibe un chute
         *de adrenalina y se suman 5 puntos de vida, la partida constará de 15 asaltos*/
		int asalto=0;
		int vida = 100; 
		int defensa;
		int parada=0;
		Scanner entrada = new Scanner(System.in);
		while (vida>0&&asalto!=14) {
			System.out.print("******************************\n");
			System.out.print("******************************\n");
			System.out.print("ELIGE A QUÉ ALTURA DETENER EL GOLPE\n0:escudo abajo\n"
					+ "1:escudo al medio \n2:escudo arriba");
			int daño=(int)((Math.random()*30)+1);
			int alturaGolpe=((int)((Math.random()*3000))%3);
			defensa=entrada.nextInt();
			if (defensa==alturaGolpe) {
				asalto++;
				parada++;
				System.out.print("\nPARAS EL GOLPE y evitas "+daño+" puntos de daño");
				System.out.print(" Tu vida actual es: "+vida+"\n\n");
				System.out.print("Asaltos= "+asalto+"\n");
				if(parada==3) {
					vida=vida+5;
					parada=0;
					System.out.println("CHUTE DE ADRENALINA");
					System.out.println("vida= "+vida);
				}
			}
			else{
				parada=0;	
				asalto++;			
				vida=vida-daño;
				System.out.print("\nno logras detener el golpe.El monstruo te hace "+daño+" puntos de daño\nTu vida restante es: "+vida+"\n\n");
			}
		}
		if (vida<=0) {
			System.out.println("HAS MUERTO. FIN DE LA PARTIDA\nNúmero de asaltos= "+asalto);
			System.out.println("vida restante= "+vida);
		}
		else if (asalto==15) {

			System.out.println("Sales del coliseo con vida y consigues tu libertad");

			System.out.println("vida restante= "+vida);

			System.out.println("Asaltos superados: 15");
		}
        entrada.close();
	}
}
