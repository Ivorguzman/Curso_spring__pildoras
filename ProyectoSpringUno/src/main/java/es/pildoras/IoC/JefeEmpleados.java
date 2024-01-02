package es.pildoras.IoC;

public class JefeEmpleados implements Empleados {

	@Override public String getTareas() {
		return "Soy JefeEmpleados y Gestiono todo lo relacionado a los empleados";
	}

}
