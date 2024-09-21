package TerceraEva.personal;

public class Mecanico {
    // Enum de especialidades fijas de los mecánicos
    public enum especialidad {FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR};
	// Datos de los mecánicos
	public String nombre;
	public int telefono;
	public especialidad espe;
	// Constructor de un mecánico en el que incluimos todos sus datos
	public Mecanico (String nb, int tfn, String espe) {
		this.nombre=nb;
		this.telefono=tfn;
		this.espe=especialidad.valueOf(espe);
	}
    // Costructor con datos de mecánico al que podremos asignar sus datos mas adelante
	public Mecanico () {
	
    // Setters para las variables
	}
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setEspe(especialidad espe) {
        this.espe = espe;
    }

    // Getters para las variables
    public String getNombre() {
        return nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public especialidad getEspe() {
        return espe;
    }
}
