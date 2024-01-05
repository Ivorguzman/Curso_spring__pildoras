package es.pildoras.IoC;

public class SecretarioEmpleados implements Empleados {

	// Creacion de campo tipo: CreaciondeInforme(intefaz)
	private CreacionInformes informeNuevo;
	
	
	private String email;
	private String nombreEmpresa;
	

	// Injeccion de dependencia con metodo seter
	// PASO 2: Creacion del SETER que inyecta la dependencia
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}


	public String getEmail() {
		return this.email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNombreEmpresa() {
		return this.nombreEmpresa;
	}


	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}


	@Override public String getTareas() {
		return "Soy SecretarioEmpleados y gestiono todo lo del secretariado";
	}


	@Override public String getInformes() {
		return "Esteinforme  es presentado por SeretarioEmpleado " + this.informeNuevo.getInformes();
	}


}
