package TerceraEva.maquinaria;

import java.util.Arrays;

import TerceraEva.Personal.Maquinista;
// Un tren esta formado por su maquinista, locomotora, vagones.
public class Tren {
    public Locomotora loc;
	public Vagon [] numero;
	public Maquinista maq;
	public int numVagones;
	// Constructor de un tren al que le pasamos por parámetro una locomotora y un maquinista
    // Numero de vagones de un se inicializa por defecto en 5
	public Tren (Locomotora a, Maquinista b) {
		this.loc=a;
		this.maq=b;
		numero= new Vagon [5];
		numVagones=0;
	}
	// Constructor de tren cuyos parámetros son una locomotora, un maquinista y un vagon
	public Tren (Locomotora a, Maquinista c, Vagon b) {
		this (a,c);
		this.numero[0]=b;
	}
	
    // Funcion para enganchar un vagon, introduciendo las características del mismo
    // teniendo en cuenta que un tren no puede llevar mas de 5 vagones
	public void enganchaVagon (int num, double max, double act, String tipo) {
		if (numVagones >=5)	 {
			System.out.println("El tren no acepta mas vagones");
		}
		else {
			Vagon v=new Vagon (num, max, act, tipo);
			numero[numVagones]=v;
			numVagones++;
		}
	}
	
	// Función para modificar los datos de un vagon que hayamos cambiado
	public boolean setVagon(Vagon a) {
		boolean posible=true;
		for (int i=0; i<numero.length;i++) {
			if (numero[i]!=null) {
				numero[i]=a;
				i=numero.length;
			}
			else {
				posible=false;
			}
		}
		return posible;
	}

    @Override
    public String toString() {
        return "Tren [loc=" + loc + ", numero=" + Arrays.toString(numero) + ", maq=" + maq + ", numVagones="
                + numVagones + "]";
    }
}
