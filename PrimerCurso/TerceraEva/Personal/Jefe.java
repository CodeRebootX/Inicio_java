package TerceraEva.Personal;

import java.util.Date;

public class Jefe {
    //Variables con los datos del Jefe
    public String nombre;
	public String DNI;
	public Date fecha;
	
    //Constructor de Jefe con todos sus datos
	public Jefe (String nb, String dni, Date date) {
		this.nombre=nb;
		this.DNI=dni;
		this.fecha=date;
	}
	
    //Constructor de Jefe cuyos datos se añadirán posteriormente
	public Jefe () {
		
	}
    //Getters de las variables
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    //Setters de las variables
    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
