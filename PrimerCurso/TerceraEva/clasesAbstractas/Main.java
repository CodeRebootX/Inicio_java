package TerceraEva.clasesAbstractas;

import TerceraEva.clasesAbstractas.Instrumento.notasMusicales;

public class Main {
    	public static void main(String[] args) {
		notasMusicales cancion[]= {notasMusicales.DO, notasMusicales.SI, notasMusicales.DO, notasMusicales.SI, notasMusicales.DO};
		Piano a=new Piano ();
		for (int i=0;i<cancion.length;i++) {
			a.add(cancion[i]);
		}
		a.interpretar();
	}

}
