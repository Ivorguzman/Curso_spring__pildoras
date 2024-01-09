package es.pildorasIoC.Singleton_Y_Prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingeltonPrototype {

	public static void main(String[] args) {



		// 01 cargar xml de configuración
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContextPatrones.xml");


		// O2 Creacion de bean(s) con metodo getBean("...") contenedor de Spring


		// **************** PATRON SINGLETON ****************
		// bean 01
		SecretarioEmpleadosSingLeton Maria2 = contexto.getBean("miSecretarioEmpleadosSingLeton", SecretarioEmpleadosSingLeton.class);
		SecretarioEmpleadosSingLeton Pepe2 = contexto.getBean("miSecretarioEmpleadosSingLeton", SecretarioEmpleadosSingLeton.class);

		System.out.println("*********** Ejemplo de Patron SingLeton *************** :");
		System.out.println("Maria2 Dirección de memoria ==> " + Maria2);
		System.out.println("Pepe2 Dirección de memoria ==> " + Pepe2);
		System.out.println();
		System.out.println("Maria2 hashCode ==> " + Maria2.hashCode());
		System.out.println("Pepe2 hashCode  ==> " + Pepe2.hashCode());
		System.out.println();
		System.out.println();
		System.out.println();



		// **************** PATRON PROTOTYPE ****************
		// bean 02
		SecretarioEmpleadosPrototype Maria = contexto.getBean("miSecretarioEmpleadosPrototype", SecretarioEmpleadosPrototype.class);
		SecretarioEmpleadosPrototype Pepe = contexto.getBean("miSecretarioEmpleadosPrototype", SecretarioEmpleadosPrototype.class);


		System.out.println("********* Ejemplo de Patron Prototype ********* :");
		System.out.println("Maria Dirección de memoria ==> " + Maria);
		System.out.println("Pepe Dirección de memoria ==> " + Pepe);
		System.out.println();
		System.out.println("Maria hashCode ==> " + Maria.hashCode());
		System.out.println("Pepe hashCode  ==> " + Pepe.hashCode());






	}

}
