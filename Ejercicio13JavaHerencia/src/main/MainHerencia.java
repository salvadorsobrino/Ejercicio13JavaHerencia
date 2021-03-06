package main;
import java.util.ArrayList;
import java.util.List;

import entidades.Directivo;
import entidades.Empleado;
import entidades.Jefe;
import entidades.Trabajador;

public class MainHerencia {
	public static void main(String[] args) {
		//El programa creara 3 trabajadores, 2 jefes y un directivo.
		List<Empleado> listaEmpleadosDirectivo = new ArrayList<Empleado>();
		List<Empleado> listaEmpleados = new ArrayList<Empleado>();
		
		//3 Empleados
		Empleado e = new Trabajador("Pepe",1200.5,10);
		listaEmpleadosDirectivo.add(e);
		listaEmpleados.add(e);
		e = new Trabajador("Daniela",1300.0,7);
		listaEmpleados.add(e);
		e = new Trabajador("Victor",1100.0,6);
		listaEmpleadosDirectivo.add(e);
		listaEmpleados.add(e);
		//2 Jefes
		e = new Jefe ("Juan",1500.5,500);
		listaEmpleadosDirectivo.add(e);
		listaEmpleados.add(e);
		e = new Jefe ("David",1500.5,600);
		listaEmpleados.add(e);
		//1 Directivo
		e = new Directivo("Alejandro",3000.0,listaEmpleadosDirectivo);
		listaEmpleados.add(e);
		
		System.out.println("=== Primera forma de hacer bucle for ===");
		for (int i=0;i<listaEmpleados.size();i++) {
			listaEmpleados.get(i).calcularSueldoFinal(listaEmpleados.get(i));
		}
		System.out.println("=== Segunda forma de hacer bucle for ===");
		for(Empleado eaux : listaEmpleados) {
			eaux.calcularSueldoFinal(eaux);
		}
		System.out.println("=== Evitar que se pueda calcular el salario de otro ===");
		listaEmpleados.get(5).calcularSueldoFinal(listaEmpleados.get(2));
		listaEmpleados.get(5).calcularSueldoFinal(listaEmpleados.get(4));
		listaEmpleados.get(1).calcularSueldoFinal(listaEmpleados.get(0));
		listaEmpleados.get(1).calcularSueldoFinal(listaEmpleados.get(3));
	}
}
