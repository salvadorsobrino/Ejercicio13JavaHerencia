package entidades;

public abstract class Empleado {
	protected String nombre;
	protected Double sueldoBase;
	
	public Empleado(String nombre, Double sueldoBase) {
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		
	}
	/** M?todo abstracto que recibe un Object y que calcular? el sueldoFinal de cada Empleado seg?n el tipo de Empleado que sea 
	 * 
	 * @param e Objeto que recibe el m?todo para posteriormente castearlo
	 */
	public abstract void calcularSueldoFinal(Object e);
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(Double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	

	
}
