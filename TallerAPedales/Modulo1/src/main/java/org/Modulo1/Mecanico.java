package org.Modulo1;

public class Mecanico {

	private String nombre;
	
	public Mecanico(String nombre) {
		this.nombre = nombre;
	}
	
	public void asignarBox(Taller taller,int Box,int Turno) {
		taller.getBox(Box).getTurno(Turno).setMecanico(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
