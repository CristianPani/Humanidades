package com.milprogramadores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CertificadoAlumno {
private ConexionBD Conexion;
public CertificadoAlumno() {
	
	//public static void main(String[] args) throws SQLException {
Conexion = new ConexionBD();

}
public void menu (Usuario user) throws SQLException {
	
		System.out.println("------ *CERTIFICADO DE ALUMNO REGULAR* ------\nIngrese su LU: ");
		Scanner teclado = new Scanner(System.in);
		int lu = teclado.nextInt();
		
		Statement stm = ConexionBD.getStatement();
		
		ResultSet result = null;		
		result = stm.executeQuery("select * from alumno where libreta_univ = "+"'"+lu+"'");
		
		while(result.next()) {
			System.out.println("El alumno " +result.getString("nombre") +" " + result.getString("Apellido") +" cursa en la facultad de Humanidades la carrera N°" + result.getString("carrera"));
			
			
		}
		
			
		
		stm.close();

		
		
		
	}

}
