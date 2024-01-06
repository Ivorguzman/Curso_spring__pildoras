package es.pildorasIoC.Singleton_Y_Prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingeltonPrototype {

	public static void main(String[] args) {



		// 01 cargar xml de configuración
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContextPatrones.xml");


		// O2 Creacion de bean(s) con metodo getBean("...") contenedor de Spring
		SecretarioEmpleados Maria = contexto.getBean("miSecretarioEmpleados", SecretarioEmpleados.class);
		SecretarioEmpleados Pepe = contexto.getBean("miSecretarioEmpleados", SecretarioEmpleados.class);


		System.out.println("Maria hashCode ==> " + Maria.hashCode());
		System.out.println("Pepe hashCode  ==> " + Pepe.hashCode());


	}

}
