package com.milprogramadores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {

	private String username;
	private String password;
	
	public Login(String username, String password) {
		
		this.username = username;
		this.password = password;
	}
	
	
	public Usuario ingresar() throws SQLException {
		
		Usuario user = null;
		ConexionBD conexion = new ConexionBD();
		

		Statement stm = ConexionBD.getStatement();
		
		ResultSet result = null;		
		result = stm.executeQuery("select * from alumno where username = "+"'"+this.username+"'"+" and password="+"'"+this.password+"'");
		
		
		
		while(result.next()) {
			System.out.println("Ingreso Exitoso!!!!");
			
			int id=result.getInt("id");
			String nombre=result.getString("nombre");
			String apellido=result.getString("apellido");
			int dni=result.getInt("dni");
			String domicilio=result.getString("domicilio");	
			int libreta_univ=result.getInt("libreta_univ");
			int carrera=result.getInt("carrera");
			String username =result.getString("username");	
			String password = result.getString("password");
			int tipo_usuario = result.getInt("tipo_usuario");
			user = new Usuario (id, nombre, apellido, dni, domicilio, libreta_univ,carrera, username, password, tipo_usuario);
			
		}
		return user;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

