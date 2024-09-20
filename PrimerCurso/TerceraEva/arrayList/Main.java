package TerceraEva.arrayList;

public class Main {
    public static void main(String[] args) {
        Lista l1 = new Lista();
		Lista l2 = new Lista();
		Integer c=12;
		l1.insertarFinal(21);
		l1.insertarFinal(7);
		l1.insertarFinal(14);
		System.out.println(l1.toString());
		//l1.mostrar();
		
		l1.insertar(22, 2);
		//l1.mostrar();
		
		
		l2.insertarFinal(12);
		l2.insertarFinal(7);
		l2.insertarFinal(23);
		
		l1.insertarFinal(l2);
		l1.mostrar();
		l1.eliminarElemento(9);
		l1.eliminarOrdenado(2);
		l1.mostrar();
		l2.mostrar();
		Integer a=l1.get(3);
		System.out.println("El elemento que se encuentra en dicha posicion es: "+a);
		int b=l1.buscar(c);
		System.out.println(b);
		Lista.mostrar2(l1.buscar(12));
		
		
		Lista l3= new Lista();
		l3=Lista.concatena(l1, l2);
		l3.mostrar();
		
		Lista.concatena2(l1, l2);
		
		l1.mostrar();
		System.out.println("EMPEZAMOS CON LA PILA");
		Pila j = new Pila();
		j.mostrarPila();
		j.mostrarCantidad();
		j.apilar(15);
		j.apilar(12);
		j.apilar(16);
		j.apilar(18);
		j.apilar(1);
		j.mostrarPila();
		j.mostrarCantidad();
		j.desapilar();
		j.mostrarPila();
		j.desapilar2();
		j.mostrarPila();
		j.mostrarCantidad();
    }
}
