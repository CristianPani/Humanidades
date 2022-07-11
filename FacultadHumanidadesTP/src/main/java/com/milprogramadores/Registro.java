package com.milprogramadores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Registro {
	
	private String nombre;
	private String apellido;
	private int dni;
	private String domilicio;
	private int libreta_univ;
	private int carrera;
	private String username;
	private String password;
	
	public Registro () {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese nombre: ");
		this.nombre=entrada.next();
		
		System.out.println("Ingrese apellido: ");
		this.apellido=entrada.next();
		
		System.out.println("Ingrese dni: ");
		this.dni=entrada.nextInt();
		
		System.out.println("Ingrese domicilio: ");
		this.domilicio=entrada.next();
		
		System.out.println("Ingrese libreta universitaria: ");
		this.libreta_univ=entrada.nextInt();
		
		System.out.println("Ingrese username: ");
		this.username=entrada.next();
		
		System.out.println("Ingrese password: ");
		this.password=entrada.next();
		
	}
	public Usuario validarReg() throws SQLException {
		if(this.nombre!=""&&this.apellido!=""&&this.username!=""&&this.password!="") { //búsqueda en base de datos
			
			Statement stm = ConexionBD.getStatement();
			
			ResultSet result = null;		
			result = stm.executeQuery("insert into alumno (nombre, apellido, dni, domicilio, libreta_univ, username, password)  values ('"+this.nombre+"', '"+this.apellido+"', '"+this.dni+"', '"+this.domilicio+"', '"+this.libreta_univ+"', '"+this.username+"', '"+this.password+"'");
			
			ConexionBD conexion = new ConexionBD();
			System.out.println("====REGISTRO CREADO====");
			
		
		}
		else {
			System.out.println("===DATOS ERRÓNEOS===");
		}
		return null;
	}
}

	