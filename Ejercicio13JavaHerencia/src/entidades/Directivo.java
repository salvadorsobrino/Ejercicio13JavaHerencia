package entidades;

import java.util.ArrayList;
import java.util.List;

public class Directivo extends Empleado{
	private List<Empleado> listaEmpleados = new ArrayList<Empleado>();

	public Directivo(String nombre, Double sueldoBase,List<Empleado> listaEmpleados) {
		super(nombre, sueldoBase);
		this.listaEmpleados = listaEmpleados;
	}

	@Override
	public void calcularSueldoFinal(Object e) {
		Empleado d = (Empleado)e;
		if(e instanceof Directivo && this.nombre.equals(d.getNombre())) {
			d = (Directivo)e;
			System.out.println("Soy el Empleado(Directivo): " + d.getNombre() + " y mi salario es: " + (d.getSueldoBase()+(this.listaEmpleados.size()*100)));
			}
		else {
			System.out.println("No se ha podido calcular ya que son datos privados del Empleado: "+d.getNombre());
		}
		
	}

}
