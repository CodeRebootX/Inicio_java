package TerceraEva.clasesAbstractas;

import java.util.Arrays;

/* Enum que almacena en una tabla las notas musicales de una melodía(dentro de una misma octava).
 * El método add() añade nuevas notas musicales.
 * La clase también dispone del método abstracto interpretar() que,
 * en cada subclase que herede de Instrumento,
 * mostrará por consola las notas musicales según las interprete.
 * Utilizar enumerados para definir las notas musicales.
 
//La clase abstracta Instrumento, básicamente contiene una tabla con una serie de notas.
 * Cada clase que herede de Instrumento, tendrá que implementar
 * el método interpretar() donde se decide de qué forma suenan las notas.
 * Distinguiremos un timbre de otro, por la forma en que escribamos las notas,
 * por ejemplo: do, Do, Doloooon, dooooooooo, etc
 */

public abstract class Instrumento {
    public enum notasMusicales {DO, RE, MI, FA, SOL, LA, SI};// tabla que almacena las notas a interpritar
	 protected notasMusicales [] melodia;
	 
	 
	 public Instrumento () {
		 melodia = new notasMusicales [0];// creamos la tabla
		 
	 }
	 
	 void add (notasMusicales n) {
		 melodia=Arrays.copyOf(melodia, melodia.length+1);
		 melodia[melodia.length-1]=n;
	 }
	 
	 abstract void interpretar (); // a implementar en cada subclase
}
