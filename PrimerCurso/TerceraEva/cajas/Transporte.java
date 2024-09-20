package TerceraEva.cajas;

public class Transporte {
    protected int ancho;
	protected int alto;
	protected int fondo;
	public Unidad m;
	public String etiqueta;
	//constructor pasando todos los parametro del paquete
    //etiqueta se inicializa vacía
	public Transporte (int a, int aa, int f, Unidad c) {
		ancho=a;
		alto=aa;
		fondo=f;
		m=c;
		etiqueta="";
	}

	//Calculamos volumen del paquete

	double getVolumen(){
		double volumen;
		if(this.m == Unidad.m) {
			volumen = ancho * alto * fondo;
		}else {
			volumen = (ancho * alto * fondo) / 1000000;	
		}
		return volumen;
	}	

    //ToString para saber obtener medidas del paquete

	@Override
	public String toString() {
		return alto + "x" + ancho + "x" + fondo;
	}

    //Introducir datos de etiqueta

	void setEtiqueta(String etiqueta) {
		if(etiqueta.length() < 51) {
			this.etiqueta = etiqueta;
		}else {
			System.out.println("Error, tamaño máximo de 50 caracteres");
		}
	}
}
