package SegundaEva;

import java.util.Arrays;
import java.util.Scanner;

public class HundirLaFlota {
    public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		int tamaño=12; int cont1=0; int cont2=0;
		char [][]jugador1; char [][]jugador2; char [][]jugada1; char [][] jugada2;
		jugador1=rellenarAgua(tamaño);
		jugador2=rellenarAgua(tamaño);
		System.out.println("		BIENVENIDO A HUNDIR LA FLOTA");
		espacios(1);
		System.out.println("JUGADOR 1 ubica tus barcos:");
		espacios(1);
		System.out.println("- 1 Portaaviones (5)");
		System.out.println("- 1 Acorazado (4)");
		System.out.println("- 2 Destructores (3)");
		System.out.println("- 1 Submarino (2)");
		espacios(1);
		System.out.println("Te iré indicando los que vayas ubicando");
		espacios(1);
		colocarBarcos(jugador1);
		mostrar(jugador1);
		espacios(80);
		System.out.println("JUGADOR 2 ubica tus barcos:");
		espacios(1);
		System.out.println("- 1 Portaaviones (5)");
		System.out.println("- 1 Acorazado (4)");
		System.out.println("- 2 Destructores (3)");
		System.out.println("- 1 Submarino (2)");
		espacios(1);
		System.out.println("Te iré indicando los que vayas ubicando");
		espacios(1);
		colocarBarcos(jugador2);
		mostrar(jugador2);
		espacios(80);
		jugada1=rellenarEspacios(12);
		jugada2=rellenarEspacios(12);
		System.out.println("	¡¡QUE COMINCIE EL JUEGO!!! ");
		while ((cont1<5)&&(cont2<5)) {
			System.out.println("JUGADOR 1 tu turno ");
			espacios(1);
			cont1=jugada(jugador2,jugada2);
			espacios(2);
			System.out.println("JUGADOR 2 tu turno ");
			espacios(1);
			cont2=jugada(jugador1,jugada1);
		}
		System.out.println("GRACIAS POR JUGAR ");
		entrada.close();
		

	}
	static void mostrarEspecial (char [][]a) {
		char num=65;
		for (int i=1;i<a.length-1;i++) {
			a[0][i]=num;
			num++;
		}
		for (int i=1;i<a.length-1;i++) {
			for (int j=1;j<a.length-1;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static int hundido (char [][]a,char [][]b) {
		int cont=0; boolean inicio=false;
		for (int i=1;i<a.length-1;i++) {
			for (int j=1;j<a.length-1;j++) {
				if (b[i][j]=='T') {
					cont++;
					inicio=inicioH(j,i,a);
					if (inicio) {
						
					}
				}
			}
		}
		return cont;
	}
	
	static boolean finH (int letra, int numero, char [][]a) {
		boolean fH=false;
		if ((a[numero-1][letra]==126)&&(a[numero+1][letra]==126)&&(a[numero][letra+1]==126)&&(a[numero][letra]=='O')) {
			fH=true;
		}
		return fH;
	}

	static boolean inicioH (int letra, int numero, char [][]a) {
		boolean IH=false;
		if ((a[numero-1][letra]==126)&&(a[numero+1][letra]==126)&&(a[numero][letra-1]==126)&&(a[numero][letra]=='O')) {
			IH=true;
		}
		return IH;
	}
	
	static boolean inicioV (int letra, int numero, char [][]a) {
		boolean IV=false;
		if ((a[numero][letra-1]==126)&&(a[numero][letra+1]==126)&&(a[numero-1][letra]==126)&&(a[numero][letra]=='O')) {
			IV=true;
		}
		return IV;
	}
	
	static boolean finV (int letra, int numero, char [][]a) {
		boolean fV=false;
		if ((a[numero][letra-1]==126)&&(a[numero][letra+1]==126)&&(a[numero+1][letra]==126)&&(a[numero][letra]=='O')) {
			fV=true;
		}
		return fV;
	}
	
	static char [][] hundidoHorizontal (int l_in, int l_fin, int numero, char [][]d) {
		for (int i=numero-1;i<=numero+1;i++) {
			for (int j=(l_in-1);j<=(l_fin+1);j++) {
				if (d[i][j]!='T') {
					d[i][j]='x';
				}
				else {
					d[i][j]='H';
				}
			}
		}
		return d;
		
	}
	
	static char [][] hundidoVertical (int n_in, int n_fin, int letra, char [][]d) {
		for (int i=(n_in-1);i<=(n_fin+1);i++) {
			for (int j=(letra-1);j<=(letra+1);j++) {
				if (d[i][j]!='T') {
					d[i][j]='x';
				}
				else {
					d[i][j]='H';
				}
			}
		}
		return d;
		
	}
	
	static int jugada (char [][]a, char [][]b) {
		Scanner entrada=new Scanner (System.in);
		int in=0; int fi=0; int letra,numero; int cont=0;
		String coordenada; boolean comprobarIh=false; boolean comprobarIv=false;
		boolean comprobarFh=false; boolean comprobarFv=false; 
		System.out.println("Introduce coordenada");
		System.out.println("columna:");
		coordenada=entrada.next();
		letra=numero(coordenada.charAt(0));
		System.out.println("Fila:");
		numero=(entrada.nextInt());
		if (a[numero][letra]=='O') {
			b[numero][letra]='T';
			if ((a[numero][letra+1]=='O')||(a[numero][letra-1]=='O')) {//compruebo si esta en horizontal
				for (int i=1;i<a.length-1;i++) {
					comprobarIh=inicioH(i,numero,a);
					if ((comprobarIh)&&(b[numero][i]!='T')) {//encuentra inicio de barco en tabla original pero no hemos acertado en esta tirada u otra
						i=(a.length-1);
					}
					else if ((comprobarIh)&&(b[numero][i]=='T')) {//encuentra inico y hemos acertado en alguna tirada
						in=i;
						for(int j=2;j<(a.length-2);j++) {//en esa fila pasamos a buscar fin de barco
							comprobarFh=finH(j,numero,a);	
							if((comprobarFh)&&(b[numero][j]!='T')) {
								j=(a.length-2);
								comprobarFh=false;
								i=(a.length-1);
							}
							else if ((comprobarFh)&&(b[numero][j]=='T')) {
								fi=j;
								j=(a.length-2);
								i=(a.length-1);
							}
						}
					
					}
				
				}
				for (int i=in;i<=fi;i++) {//recorremos desde inico a final para ver si esta el barco entero hundido
					System.out.println(b[i][numero]);
					if (b[numero][i]!='T') {
						comprobarIh=false;
					}
				}
				System.out.println("Has acertado!!!");	
				if ((comprobarIh)&&(comprobarFh)) {//confirmamos que esta el barco entero hundido y lo rodeamos de agua
					System.out.println("Y lo has hundido!!!!");
					hundidoHorizontal(in,fi,numero,b);
					cont++;
				
				}
			}
			else if ((a[numero-1][letra]=='O')||(a[numero+1][letra]=='O')) {//comprobamos si esta vertical
				for (int i=1;i<a.length-1;i++) {
					comprobarIv=inicioV(letra,i,a);
					System.out.println(b[i][letra]);
					if ((comprobarIv)&&(b[i][letra]!='T')) {
						i=(a.length-1);
					}
					else if ((comprobarIv)&&(b[i][letra]=='T')) {
						in=i;
						for(int j=2;j<(a.length-2);j++) {
							comprobarFv=finV(letra,j,a);	
							if((comprobarFv)&&(b[j][letra]!='T')) {
								j=(a.length-2);
								comprobarFv=false;
								i=(a.length-1);
							}
							else if ((comprobarFv)&&(b[j][letra]=='T')) {
								fi=j;
								j=(a.length-2);
								i=(a.length-1);
							}
						}
					
					}
				
				}
				for (int i=in;i<=fi;i++) {
					System.out.println(b[letra][i]);
					if (b[i][letra]!='T') {
						comprobarIv=false;
					}
				}
				System.out.println("Has acertado!!!");	
				if ((comprobarIv)&&(comprobarFv)) {
					System.out.println("Y lo has hundido!!!!");
					hundidoVertical(in,fi,letra,b);
					cont++;
				}
			}
			
			mostrar(b);
			jugada(a,b);
		} else {		
			System.out.println("Agua!!!!");
			b[numero][letra]='x';
			if ((comprobarIh)&&(comprobarFh)) {//si lo he hundido, si no pongo esto el ultimo me lo cambia de H a x
				b[numero][letra]='H';
			}
			mostrar(b);
		}
        entrada.close();
		return cont;
	}
	
	static char [][] colocarBarcos (char [][]a) {
		Scanner entrada =new Scanner(System.in);
		String coordenada; int letra; int orientacion; int tamaño; int numero;
		boolean horizontal=false; int barcos=0; boolean []boolBarco=new boolean[5];
		String []nombreBarco=new String [5]; int cont3=0; int pos=2; boolean fuera=false;
		boolean existe=false;
		while (barcos<5) {
			System.out.println("Introduce coordenadas de incio de tu barco");
			espacios(1);
			mostrar(a);
			espacios(1);
			System.out.println("Columna:");
			coordenada=entrada.next();
			letra=numero(coordenada.charAt(0));
			System.out.println("Fila:");
			numero=(entrada.nextInt());
			System.out.println("Introduce orientacion: 1 para horizontal o 2 para vertical");
			orientacion=entrada.nextInt();
			if (orientacion==1) {
				horizontal=true;
			}
			if (orientacion==2) {
				horizontal=false;
			} 
			System.out.println("Introduce tamaño de barco:");
			espacios(1);
			tamaño=entrada.nextInt();
			if (boolBarco[0]==true) {
				System.out.println("Este barco ya lo has colocado");
				System.out.println("Introduce coordenadas de incio de tu barco");
				espacios(1);
				mostrar(a);
				espacios(1);
				System.out.println("Columna:");
				coordenada=entrada.next();
				letra=numero(coordenada.charAt(0));
				System.out.println("Fila:");
				numero=(entrada.nextInt());
				System.out.println("Introduce orientacion: 1 para horizontal o 2 para vertical");
				orientacion=entrada.nextInt();
				if (orientacion==1) {
					horizontal=true;
				}
				if (orientacion==2) {
					horizontal=false;
				} 
				System.out.println("Introduce tamaño de barco:");
				espacios(1);
				tamaño=entrada.nextInt();
			}
			if (horizontal) {
				for (int i=(numero-1);i<=(numero+1);i++) {
					for (int j=(letra-1);j<=(letra+tamaño);j++) {
						if (j>(a.length-1)) {
							System.out.println("No puedes colocarlo, no esta dentro de la tabla");
							fuera=true;
							j=(letra+tamaño+1);
							i=(numero+2);
						} 
						else if (a[i][j]=='O') {
							System.out.println("No puedes colocarlo, existe un barco en la inmediacion ");
							existe=true;
							j=(letra+tamaño+1);
							i=(numero+2);
						}						
					}
				}
				if ((!existe)&&(!fuera)) {
					for (int i=0;i<tamaño;i++) {
						a[numero][letra]='O';
						letra++;
					}
					barcos++;
				}
			}
			else {
				for (int i=(numero-1);i<=(numero+tamaño);i++) {
					for (int j=(letra-1);j<=(letra+1);j++) {
						if (i>(a.length-1)) {
							System.out.println("No puedes colocarlo en esta posicion, se sale de tabla");
							fuera=true;
							j=(letra+2);
							i=(numero+tamaño+2);
						}
						else if (a[i][j]=='O') {
							System.out.println("No puedes colocarlo, existe un barco dentro de sus limites");
							existe=true;
							j=(letra+2);
							i=(numero+tamaño+2);
						}
					}
				}
				if ((!existe)&&(!fuera)) {
					for (int i=0;i<tamaño;i++) {
						a[numero][letra]='O';
						numero++;
					}
					barcos++;
				}
			
			}
			if ((tamaño==5)&&(!fuera)&&(!existe)) {
				boolBarco[0]=true;
				
				nomBarcos(boolBarco, nombreBarco);
			}
			if ((tamaño==4)&&(!fuera)&&(!existe)) {
				boolBarco[1]=true;
				nomBarcos(boolBarco, nombreBarco);
			}
			if ((tamaño==2)&&(!fuera)&&(!existe)) {
				boolBarco[4]=true;
				nomBarcos(boolBarco, nombreBarco);
			}
			if (((tamaño==3)&&(cont3<2))&&(!fuera)&&(!existe)) {
				boolBarco[pos]=true;
				nomBarcos(boolBarco, nombreBarco);
				cont3++;
				pos++;
			}
			System.out.println(Arrays.toString(nombreBarco));
			espacios(1);
			fuera=false;
			existe=false;
		}
        entrada.close();
		return a;	
		
	}

	
	static void nomBarcos ( boolean []a,String [] b) {
		for (int i=0;i<a.length;i++) {
			if (a[i]==true) {
				if (i==0) {
					b[i]="Portaaviones(5)";
				}
				else if (i==1) {
					b[i]="Acorazado(4)";
				}
				else if (i==2) {
					b[i]="Destructor(3)";
				}
				else if (i==3) {
					b[i]="Destructor(3)";
				}
				else if (i==4) {
					b[i]="Submarino(2)";
				}
					
			}
		}
	}
	
	static char [][] rellenarAgua(int tamaño) {
		char [][]a=new char [tamaño][tamaño];
		for (int i=0;i<tamaño;i++) {
			for (int j=0;j<tamaño;j++) {
				a[i][j]=126;
			}
		}
		return a;
	}
	
	static char [][] rellenarEspacios(int tamaño) {
		char [][]a=new char [tamaño][tamaño];
		for (int i=0;i<tamaño;i++) {
			for (int j=0;j<tamaño;j++) {
				a[i][j]='-';
			}
		}
		return a;
	}
	
	
	static void mostrar (char [][] a) {
		for (int i=1;i<a.length-1;i++) {
			for (int j=1;j<a.length-1;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void mostrarReal (char [][]a) {
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void espacios (int a) {
		for (int i=0;i<a;i++) {
			System.out.println();
			}
	}
	
	
	static int numero (char a) {
		int num=a-96;
		return num;
		
	}
}
