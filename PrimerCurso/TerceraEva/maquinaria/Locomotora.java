package TerceraEva.maquinaria;

import TerceraEva.personal.Mecanico;
/*Asignamos características de una locomotora y le asignamos un mecánico del paquete <personal> */
public class Locomotora {
    public String matricula;
	public int potencia;
	public int antiguedad;
	public Mecanico mec;
	
    // Constructor de una locomotora pasando como parámetros todos sus características
	public Locomotora (String matri, int pot, int anti, Mecanico mecanic) {
		this.matricula=matri;
		this.potencia=pot;
		this.antiguedad=anti;
		this.mec=mecanic;
	}
    // Constructor de Locomotora sin ningún dato
	public Locomotora () {
		
	}
    // Getters de las varialbes de Locomotora
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public int getAntiguedad() {
        return antiguedad;
    }

    //Setters de las variables de Locomotora
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    public Mecanico getMec() {
        return mec;
    }
    public void setMec(Mecanico mec) {
        this.mec = mec;
    }
    
}
