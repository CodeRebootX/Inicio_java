package TerceraEva.arrayList;

public class Pila {
    private Lista a;
	
	public Pila () {
		a= new Lista ();
	}
	
	int cantidad() {
		return a.numeroElementos();
	}
	
	void apilar (Integer b) {
		a.insertarFinal(b);
	}
	
	void desapilar () {
		a.eliminarFinal();
	}
	
	void desapilar2() {
		a.eliminarElemento(a.numeroElementos()-1);
	}
	
	void mostrarPila () {
		a.mostrar();
	}
	
	void mostrarCantidad () {
		System.out.println("Tienes apilados: "+cantidad()+" elementos");
	}
}
