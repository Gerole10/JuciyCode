package org.Modulo1;

public class Box {
	private int numeroBox;
	private Turno[] turnos;
	
	public Box(int numeroBox) {
		this.numeroBox = numeroBox;
		turnos = new Turno[10];
		for(int i=0; i<turnos.length; i++) {
			turnos[i] = new Turno();
		}
	}
	
	public void setNumeroBox(int numero) {
		this.numeroBox = numero;
	}

	public Turno[] getTurnos() {
		return turnos;
	}
	
	public Turno getTurno(int i) {
		return turnos[i];
	}

	public void setTurnos(Turno[] turnos) {
		this.turnos = turnos;
	}

	public int getNumeroBox() {
		return numeroBox;
	}
}
