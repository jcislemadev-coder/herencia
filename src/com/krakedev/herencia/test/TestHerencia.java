package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;

public class TestHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hija h1 = new Hija(5,8,"Paola");
		h1.setDefectos(5);
		h1.setVirtudes(8);
		
		h1.imprimir();
	}

}
