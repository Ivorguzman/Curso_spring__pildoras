package es.pildorasIoC.Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainUsoAnnotation {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		// leer el xml de configuración
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext contextoAnnotation = new ClassPathXmlApplicationContext("aplicacionContexAnnotation.xml");

		// pedir bean al contenedor
		Empleados antonio = contextoAnnotation.getBean("Experimentado", Empleados.class);


		// Usar lel bean
		System.out.println(antonio.getInformes());
		System.out.println(antonio.getTareas());







































	}

}
