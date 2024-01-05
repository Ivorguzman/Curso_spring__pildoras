package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {

	// Creacion de campo tipo: CrreaciondeInforme(intefaz)
	private CreacionInformes informeNuevo;

	// PASO 2: Creacion del contructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {

		this.informeNuevo = informeNuevo;

	}

	@Override public String getTareas() {
		return "Soy DirectorEmpleado y realizo tareas de  director";
	}

	@Override public String getInformes() {
		// TODO Esbozo de método generado automáticamente
		return "Informe creado por el director" + this.informeNuevo.getInformes();
	}

}
