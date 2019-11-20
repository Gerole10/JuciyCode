package org.Modulo1;

import java.util.ArrayList;

public class Turno {
	public enum Estado{Libre, Reservado, Ocupado, Pidiendo, EnEsperaDeRespuesta, Servidos, EsperandoLaCuenta, Pagando, EnPreparacion}
	private Cliente cliente;
	private String mecanicos = "";
	
	public Turno() {
	}
	
	public String toString() { 
		if(cliente != null && mecanicos != "") {
			return "Estado = , Cliente = "+this.cliente.getNombre()+" , Mecanico/s= "+mecanicos;
		}
		if(cliente!= null) {
			return "Estado = , Cliente = "+this.cliente.getNombre()+" , Mecanico/s=";
		}
		if(mecanicos!= "") {
			return "Estado = , Cliente =  , Mecanico/s= "+mecanicos;
		}
		
		return "Estado = , Cliente = , Mecanico/s=";
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

	public String getMecanicos() {
		return mecanicos;
	}


	public void setMecanico(String mecanico) {
		mecanicos += mecanico + " ";
	}
	
}
