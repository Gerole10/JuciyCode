package org.Modulo1;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args){
	Taller taller = new Taller();
	Scanner sc = new Scanner(System.in);
	int puesto = -1;
	do {
	System.out.println("Seleccione su puesto:\n1.Jefe de taller. \n2.Mecanico");
	puesto = sc.nextInt();
	int opcion = -1;
	
	if(puesto==1) {
		JefeTaller jefeTaller = new JefeTaller();
		do {
		System.out.println("Seleccione que desea hacer:\n1.Mostrar los 10 turnos de cada box.\n2.Asignar cliente a un box.");
		opcion = sc.nextInt();
		switch(opcion){
			case 1:
				for(int i=0; i<taller.getBoxes().length; i++) {
					System.out.println("Los datos de los turnos del box "+i+" son:");
					for(int j=0; j< taller.getBox(i).getTurnos().length;j++) {
						System.out.println(taller.getBox(i).getTurno(j).toString());
					}
				}
				break;
			case 2:
				System.out.println("Introduzca el nombre del cliente");
				String nombre = sc.next();
				System.out.println("Introduzca el numero del box");
				int box = sc.nextInt();
				System.out.println("Introduzca el turno del box");
				int turno = sc.nextInt();
				jefeTaller.asignarCliente(taller, nombre,box,turno);
				break;
			}
		}while(opcion!=0);
			
	}else {
		System.out.println("Introduzca su nombre");
		String nombre = sc.next();
		Mecanico mecanico = new Mecanico(nombre);
		do {
		System.out.println("Seleccione que desea hacer:\n1.Seleccionar box en el que estoy trabajando.");
		opcion = sc.nextInt();
		switch(opcion){
			case 1:
				System.out.println("Introduzca el numero del box en el que esta trabajando");
				int box = sc.nextInt();
				System.out.println("Introduzca el numero del box en el que esta trabajando");
				int turno = sc.nextInt();
				mecanico.asignarBox(taller,box,turno);
				break;
			}
		}while(opcion!=0);
	}
	
	}while(puesto!=0);
	}
}