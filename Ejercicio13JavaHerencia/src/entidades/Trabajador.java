package entidades;

public class Trabajador extends Empleado {
	private int valoracion;
	public Trabajador(String nombre, Double sueldoBase,int valoracion) {
		super(nombre, sueldoBase);
		this.valoracion=valoracion;
	}

	@Override
	public void calcularSueldoFinal(Empleado e) {
		// TODO Auto-generated method stub
		if(e instanceof Trabajador) {
			Trabajador t = (Trabajador)e;
			System.out.println("Soy el Empleado(Trabajador): " + t.getNombre() + " y mi salario es: " + (t.getSueldoBase()+t.extraValoracion(this.valoracion)));
			}
	}
	
	/** 
	 * M�todo que devuelve un entero seg�n la clasificaci�n seg�n la valoraci�n
	 *  0-4 : +0
		5-6 : + 50
		7-8 : + 100
		9-10: + 200
	 * @param v indica la valoraci�n
	 * @return extra indica el extra que tienes seg�n tu valoraci�n
	 */
	public int extraValoracion(int v) {
		int extra;
		switch(v) {
		case(0):
		case(1):
		case(2):
		case(3):
		case(4):
			extra=0;
			break;
		case(5):
		case(6):
			extra=50;
			break;
		case(7):
		case(8):
			extra=100;
			break;
		case(9):
		case(10):
			extra=200;
			break;
		default :
			extra=0;
		}
		return extra;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

}
