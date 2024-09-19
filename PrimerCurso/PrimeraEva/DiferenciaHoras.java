package PrimeraEva;

public class DiferenciaHoras {
    public static void main(String[] args) {
		// Diseña una función a la que se le pasan las horas y minutos de dos instantes de tiempo con el siguiente prototipo
		//La función devolverá la cantidad de minutos que existen de diferencia entre los dos instantes utilizados
		int hora1=12, hora2=12, minuto1=3, minuto2=10,total;
		total=diferencial(hora1,minuto1,hora2,minuto2);
		System.out.println(total);
		
	}
	static int diferencial (int hora1, int minuto1, int hora2, int minuto2) {
		int diferenciaH=0, diferenciaM=0,minTotal=0;
		if (hora1<hora2) {
			diferenciaH=hora2-hora1;
		}
			else if (hora1>=hora2) {
				diferenciaH=hora1-hora2;
			}
		if (minuto1<minuto2) {
			diferenciaM=minuto2-minuto1;	
		}
			else if (minuto1>=minuto2) {
				diferenciaM=minuto1-minuto2;
			}
		minTotal=(diferenciaH*60)-diferenciaM;
		if (minTotal<0) {
			minTotal=minTotal-(minTotal*2);
		}
		return minTotal;
	}
}
