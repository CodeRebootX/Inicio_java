package TerceraEva.arrayList;

import java.util.Arrays;

public class Lista implements ICola, IPila {
    	private Integer [] tabla;
	
	public Lista () {
		tabla = new Integer [0];
	}
	
	int numeroElementos() {
		return tabla.length;
	}
	
	void insertarFinal ( Integer nuevo) {
		tabla= Arrays.copyOf(tabla, tabla.length+1);
		tabla [tabla.length-1]=nuevo;
	}
	
	public void encolar (Integer elemento) {
		insertarFinal (elemento);
	}
	
	public Integer desencolar() {
		return eliminar(0);
	}
	
	public void apilar (Integer elemento) {
		insertarFinal(elemento);
	}
	
	public Integer desapilar () {
		return eliminar (tabla.length-1);
	}

	
	
	void mostrar () {
		System.out.println("Lista: "+Arrays.toString(tabla));
	}
	
	@Override

	public String toString() {
		String a="";
		for (int i=0; i<tabla.length;i++) {
			a=a+tabla[i];
		}
		
		return a;

	}
	
	@Override
	
	public boolean equals (Object a) {
		boolean iguales=true;
		Lista l1 =(Lista)a;
		if (tabla.length==l1.tabla.length) {
			for (int i=0;i<tabla.length;i++) {
				if (tabla[i]!=l1.tabla[i]) {
					iguales=false;
					i=tabla.length;
				}
			}
		} else iguales=false;
		
		return iguales;
	}

	
	
	void eliminarFinal () {
		tabla=Arrays.copyOf(tabla, tabla.length-1);
	}
	
	void insertar ( Integer nuevo, int posicion) {
		tabla=Arrays.copyOf(tabla, tabla.length+1);
		System.arraycopy(tabla, posicion, tabla, posicion+1, tabla.length-posicion-1);
		tabla[posicion]= nuevo;
	}
	
	void insertarFinal ( Lista tablaNueva) {
		tabla=Arrays.copyOf(tabla, tabla.length+tablaNueva.tabla.length);
		System.arraycopy(tablaNueva.tabla, 0, tabla, tabla.length-tablaNueva.tabla.length, tablaNueva.tabla.length);
	}
	
	public Integer eliminar (int posicion) { //al implementar las interfaces lo adaptamos de eliminarElemento
		Integer eliminado= null;
		if (posicion >=0 && posicion <=tabla.length-1) {
			eliminado= tabla[posicion];
			for (int i=posicion +1; i< tabla.length;i++) {
				tabla[i-1]=tabla[i];
			}
			tabla=Arrays.copyOf(tabla, tabla.length-1);
		}
		
		return eliminado;
	}
	
	void eliminarElemento (int posicion) {
		if (posicion >=0 && posicion <=tabla.length-1) {
			tabla[posicion]=tabla[tabla.length-1];
			tabla=Arrays.copyOf(tabla, tabla.length-1);
		}
	}
	
	void eliminarOrdenado (int posicion) {
		if (posicion >=0 && posicion <tabla.length-1) {
			System.arraycopy(tabla, posicion+1, tabla, posicion, tabla.length-posicion-1);
			tabla=Arrays.copyOf(tabla, tabla.length-1);
		}
	}
	
	Integer get ( int indice) {
		return tabla[indice];
	}
	
	int buscar (Integer claveBusqueda) {
		int posicion=-1;
		for (int i=0; i<tabla.length;i++) {
			if (tabla[i]==claveBusqueda) {
				posicion=i;
				i=tabla.length;
			}
		}
		return posicion;		
	}
	
	int buscar2 (Integer claveBusqueda) {
		int posicion=-1;
		for (int i=0;i<tabla.length&&posicion==-1;i++) {
			if (tabla[i].equals(claveBusqueda)) {
				posicion=i;
			}
		}
		return posicion;
	}
	
	//Añade a la clase Lista del ejercicio anterior  el método estático:
	//Lista concatena (Lista l1, Lista l2) que construye y devuelve una lista que contiene,
	//en el mismo orden, una copia de todos los elementos de l1 y l2
	
	static Lista concatena (Lista l1, Lista l2) {
		Lista aux= new Lista();
		aux.tabla=Arrays.copyOf(l1.tabla,l1.tabla.length+l2.tabla.length);
		System.arraycopy(l2.tabla, 0, aux.tabla, l1.tabla.length, l2.tabla.length);
		return aux;
	}
	
	static void concatena2 (Lista l1, Lista l2) {
		l1.tabla=Arrays.copyOf(l1.tabla, l1.tabla.length+l2.tabla.length);
		System.arraycopy(l2.tabla, 0, l1.tabla, l1.tabla.length-l2.tabla.length, l2.tabla.length);
	}
	
	static void mostrar2(int indice) {
		System.out.println(indice);
	}
}
