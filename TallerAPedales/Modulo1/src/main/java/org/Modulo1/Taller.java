package org.Modulo1;

public class Taller {

		private String nombreTaller;
		private Box[] boxes;
		
		public Taller() {
			this.nombreTaller= "TallerAPedales";	
			boxes = new Box[3];
			for(int i=0; i<boxes.length; i++) {
				boxes[i] = new Box(i);
			}
		}

		public String getNombreTaller() {
			return nombreTaller;
		}

		public void setNombreTaller(String nombreTaller) {
			this.nombreTaller = nombreTaller;
		}

		public Box[] getBoxes() {
			return boxes;
		}
		
		public Box getBox(int i) {
			return boxes[i];
		}

		public void setBoxes(Box[] boxes) {
			this.boxes = boxes;
		}
		
		
	}
