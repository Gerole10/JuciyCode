package org.Modulo3;

import java.util.ArrayList;

public class Estadisticas {

	private int tiempoCliente;
	private ArrayList<String> transicionYHora;
	
	public int getTiempoCliente() {
		return tiempoCliente;
	}
	public void setTiempoCliente(int tiempoCliente) {
		this.tiempoCliente = tiempoCliente;
	}
	public ArrayList<String> getTransicionYHora() {
		return transicionYHora;
	}
	public void setTransicionYHora(String transicionYHora) {
		this.transicionYHora.add(transicionYHora);
	}
	
}
