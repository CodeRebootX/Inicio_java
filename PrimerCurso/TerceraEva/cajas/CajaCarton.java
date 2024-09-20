package TerceraEva.cajas;

public class CajaCarton extends Transporte {
    //Iniciamos nueva caja con las unidades en cm por defecto
    public CajaCarton (int ancho, int alto, int fondo) {
		super(ancho, alto, fondo, Unidad.cm);
	}
	
    //Calculamos el 80% del volumen para un correcto empaquetado

	@Override
	double getVolumen(){	
		double volumen;
		volumen=super.getVolumen()*0.8;
		return volumen;
	}
	
	double getVolumenCM() {
		double volumen;
		volumen=ancho*alto*fondo;
		return volumen;
	}
	
    //Superficie necesaria para la caja de carton

	int getSuperficie() {
		int total;
		total=((ancho*alto)*2)+((alto*fondo)*2)+((ancho*fondo)*2);
		return total;
	}
	
	@Override
	public String toString() {
		return super.toString()+" cm";
	}
}
