package TerceraEva.personal;

public class Maquinista {

    //Variables con los datos de un maquinista asignado al tren
    public String nombre;
	public String DNI;
	public double sueldo;
	public String rango;
	
    //Constructor de maquinista con todos dus datos
	public Maquinista (String nb, String dni, double cant, String rango) {
		this.nombre=nb;
		this.DNI=dni;
		this.sueldo=cant;
		this.rango=rango;
	}
	
    //Constructor de maquinista cuyos datos se asignaran mas adelante
	public Maquinista () {
		
	}

    //Getters de las variables
    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getRango() {
        return rango;
    }

    //Setters de las variables
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
}
