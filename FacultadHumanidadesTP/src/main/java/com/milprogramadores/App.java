package com.milprogramadores;

import java.sql.SQLException;
import java.util.Scanner;

	public class App {

	public static void main(String[] args) throws SQLException {
	
	try (Scanner consola = new Scanner (System.in)) {
		
			System.out.println("======FACULTAD HUMANIDADES======");
			System.out.println("Ingrese opción: ");
			System.out.println("INGRESO: 1 \nREGISTRARSE: 2");
			
		int respuesta = consola.nextInt();

		if (respuesta == 1) {

			System.out.println("Ingrese usuario: ");	
			Scanner entrada = new Scanner (System.in);
			String username=entrada.nextLine();
			
			System.out.println("Ingrese Contraseña: ");
			Scanner entrada2 = new Scanner (System.in);
			String password=entrada2.nextLine();

			Login login = new Login (username, password);
		
			Usuario user =login.ingresar();
			
		if(user!=null) {
			if(user.getTipo_usuario()==1) { //1 para cliente y 2 para admin (segun mi bd)
			CertificadoAlumno cert = new CertificadoAlumno();
			
			cert.menu (user);
			}
			else {
				
				System.out.println("Inicio admin");
	}	
		}
		else { System.out.println("algo salio mal, ¿estás registrado?");
		
		System.out.println("Vamos a Registrarnos");
		System.out.println();
		Registro registro1 = new Registro();
		registro1.validarReg();
	}

		}
		else { System.out.println("no llegue a registrarme");
	}	

	}
	}
	}