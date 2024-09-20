package TerceraEva.cajas;

public class Main {
    public static void main(String[] args) {
		Transporte caja1 = new Transporte(3,5,4, Unidad.m);
		System.out.println(caja1.toString());
		System.out.println(caja1.getVolumen() + "m³");	
		CajaCarton a = new CajaCarton (30,50,40);
	
		
		
		System.out.println(a.toString());
		System.out.println(a.getVolumenCM()+"cm³");
		
		

	}
}
