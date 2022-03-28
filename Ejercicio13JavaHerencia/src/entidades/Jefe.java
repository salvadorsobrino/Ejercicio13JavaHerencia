package entidades;

public class Jefe extends Empleado{
	private double incentivos;
	
	public Jefe(String nombre, Double sueldoBase, double incentivos) {
		super(nombre, sueldoBase);
		this.incentivos=incentivos;
	}



	@Override
	public void calcularSueldoFinal(Empleado e) {
		// TODO Auto-generated method stub
		if(e instanceof Jefe) {
			Jefe j = (Jefe)e;
			System.out.println("Soy el Empleado(Jefe): " + j.getNombre() + " y mi salario es: " + (j.getSueldoBase()+j.getIncentivos()));
			}
		}
	

	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}

}