package TerceraEva.clasesAbstractas;

public class Piano extends Instrumento {
    	//podemos añadir tantos atributos como necesitemos
	public Piano () {
		super (); // constructor dela superclase
	}
	
	@Override //implementamos el método abstraco
	//recorrems las notas y las interpretaremos de la forma+
	public void interpretar () {
		for (notasMusicales notas: melodia) {
			switch (notas) {
			case DO: 
				System.out.print("do ");
				break;
			case RE: 
				System.out.print("re ");
				break;
			case MI: 
				System.out.print("mi ");
				break;
			case FA: 
				System.out.print("fa ");
				break;
			case SOL: 
				System.out.print("sol ");
				break;
			case LA: 
				System.out.print("la ");
				break;
			case SI: 
				System.out.print("si ");
				break;
			}
			System.out.println( "");
		}
	}
}
