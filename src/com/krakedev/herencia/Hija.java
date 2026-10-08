package com.krakedev.herencia;

public class Hija extends Padre {

	public Hija(int virtudes, int defectos, String nombre) {
		
		super(virtudes, defectos, nombre);
	}
	
	
	public void escucharBadBunny() {
		System.out.println("Escuchando esta musica horrible");

	}
//
//	@Override
//	public String toString() {
//		return " Defectos : "+ getDefectos() + " Virtudes: " + getVirtudes();
//	}

}
