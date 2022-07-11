package com.milprogramadores;

public class Usuario {
	
	private int id;
	private String nombre;
	private String apellido;
	private int dni;
	private String domicilio;
	private int libreta_univ;
	private int carrera;
	private String username;
	private String password;
	private int tipo_usuario;
	
	
	public Usuario(int id, String nombre, String apellido, int dni, String domicilio, int libreta_univ, int carrera, String username, String password, int tipo_usuario) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
		this.libreta_univ = libreta_univ;
		this.carrera = carrera;
		this.username = username;
		this.password = password;
		this.tipo_usuario = tipo_usuario;
	}

	
	public int getTipo_usuario() {
		return tipo_usuario;
	}


	public void setTipo_usuario(int tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getLibreta_univ() {
		return libreta_univ;
	}

	public void setLibreta_univ(int libreta_univ) {
		this.libreta_univ = libreta_univ;
	}

	public int getCarrera() {
		return carrera;
	}

	public void setCarrera(int carrera) {
		this.carrera = carrera;
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
