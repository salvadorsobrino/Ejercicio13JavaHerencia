package entidades;

public class Jefe extends Empleado{
	private double incentivos;
	
	public Jefe(String nombre, Double sueldoBase, double incentivos) {
		super(nombre, sueldoBase);
		this.incentivos=incentivos;
	}



	@Override
	public void calcularSueldoFinal(Object e) {
		// TODO Auto-generated method stub
		Empleado j = (Empleado)e;
		if(e instanceof Jefe && this.nombre.equals(j.getNombre())) {
			j = (Jefe)e;
			System.out.println("Soy el Empleado(Jefe): " + j.getNombre() + " y mi salario es: " + (j.getSueldoBase()+this.getIncentivos()));
			}
		else {
				System.out.println("No se ha podido calcular ya que son datos privados del Empleado: "+j.getNombre());
			}
		}
	

	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}

}
