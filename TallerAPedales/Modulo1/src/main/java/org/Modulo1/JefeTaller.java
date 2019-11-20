package org.Modulo1;

public class JefeTaller {

	public void asignarCliente(Taller taller, String Cliente, int Box,int Turno) {
		Cliente c = new Cliente(Cliente);
		taller.getBox(Box).getTurno(Turno).setCliente(c);
	}
}
