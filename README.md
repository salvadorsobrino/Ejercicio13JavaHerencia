 HERENCIA
 --------
 
 En una empresa hay tres tipos de empleados, todos con dos atributos comunes, el
 NOMBRE y la SUELDO BASE.
 Los tipos son los siguientes:
 	Directivos
 		- Tienen a empleados a su cargo
 	Jefes
 		- Tienen unos incentivos
 	Trabajadores
		- valoracion (1-10) 	

 A todos los empleados se les puede calcular el sueldo final pero a 
 cada uno se le calcula el sueldo en función de ciertas reglas
 	- El sueldo de los directivos es su sueldo base + el numero de empleados a su cargo multiplicado
 	por 100
 	- el sueldo de los Jefes es su sueldo base + sus incentivos
 	- el sueldo de los trabajadores es su sueldo base + un extra en funcion a su valoracion.
			0-4 : +0
			5-6 : + 50
			7-8 : + 100
			9-10: + 200
			
 Se pide
 	1)Diseñar el modelo de clases (ojo con la herencia, polimorfismo, etc)
 	2)El programa creara 3 trabajadores, 2 jefes y un director. Se le darán a cada empleado
	los valores que se estimen. El director tendrán al menos 3 empleados a su cargo.
	3)Se meterán a los empleados en un array que se recorrerá calculando el salario de cada uno de ellos
	simplemente recorriendolo y ejecutando su metodo.
	
	NOTAS:
	En lugar de hacer un if, else-if, else quería probar a realizar un switch-case pare refrescarlo en Trabajador.
	He recorrido el array de empleados de dos maneras distintas para refrescar también uno mediante índice y otro mediante objeto
	Por último se ha añadido que no se pueda calcular el salario de otro Empleado que no sea uno mismo
	Shift-Alt-J Generado JavaDoc de los métodos importantes
