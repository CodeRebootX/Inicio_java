package TerceraEva.maquinaria;
//Características de cada vagon de un tren
public class Vagon {
    int numero;
	double max;
	double actual;
	String tipo;
	//Constructor de un vagon debiendo utilizar todos sus datos
	Vagon (int num, double max, double act, String tipo) {
		this.numero=num;
		this.max=max;
		this.actual=act;
		this.tipo=tipo;
	}	
}
