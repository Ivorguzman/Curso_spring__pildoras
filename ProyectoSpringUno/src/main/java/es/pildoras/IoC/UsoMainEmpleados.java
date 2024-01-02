package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoMainEmpleados {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// Creación de objetos tipo empleado
		/*
		 * JefeEmpleados empleado1 = new JefeEmpleados();
		 * SecretarioEmpleados empleado2 = new SecretarioEmpleados();
		 * DirectorEmpleado empleado3 = new DirectorEmpleado();
		 * 
		 * System.out.println(empleado3.getTareas());
		 * System.out.println(empleado1.getTareas());
		 * System.out.println(empleado2.getTareas());
		 */



		// Uso de los objetos empleados




		// ********************USO DE SPRING FRAME WORK *****************


		/*
		 * Contexto de aplicación XML independiente, que toma los archivos
		 * de definición de contexto de la ruta de clase, interpretando
		 * rutas simples como nombres de recursos
		 * de ruta de clase que incluyen la ruta del paquete
		 * (por ejemplo, "mipaquete/mirecurso.txt").
		 */
		// Paso 1 Crear contexto(Cargar archivo XML)
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml");



		// Paso 2 Pedir el Bean
		/* Empleados Juan = contexto.getBean("miEmpleado", Empleados.class); */
		Empleados Director = contexto.getBean("miEmpleado1", Empleados.class);
		Empleados Secretario = contexto.getBean("miEmpleado2", Empleados.class);
		Empleados Jefe = contexto.getBean("miEmpleado3", Empleados.class);



		// Paso 3 Utilizar el Bean
		// System.out.println(Juan.getTareas());
		System.out.println(Director.getTareas());
		System.out.println(Secretario.getTareas());
		System.out.println(Jefe.getTareas());



		// Paso 4 Cerrar el XML
		contexto.close();











	}

}
