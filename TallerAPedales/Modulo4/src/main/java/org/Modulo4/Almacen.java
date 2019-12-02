package org.Modulo4;

public class Almacen {

	private int numeroPiezas;
	private int umbral = 100;
	
	public Almacen(int numeroPiezas) {
		this.numeroPiezas = numeroPiezas;
	}
	
	public void rellenarPiezas(int numeroPiezas) {
		this.numeroPiezas += numeroPiezas;
	}
	
	public void usarPiezas(int numeroPiezas) {
		this.numeroPiezas -= numeroPiezas;
		if(this.numeroPiezas < this.umbral) {
			System.out.println("Las piezas se estan acabando");
		}
	}	
	
	public int getNumeroPiezas() {
		return this.numeroPiezas;
	}
	
}
