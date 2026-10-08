package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Padre dad = new Padre(10,2,"Mario");
		dad.ahorrar(5000.00);
		System.out.println("Ahorro Padre: "+dad.getTotalAhorrado());

		//Paso 2 Hija
		Hija hija1 = new Hija (20,4,"Elena");
		hija1.ahorrar(5000.00);
		System.out.println("Ahorro hija: "+ hija1.getTotalAhorrado());
		
		
		//Paso 3 Hijo
		Hijo hijo1 = new Hijo(40,1,"Lucas", 10);
		hijo1.ahorrar(5000.00);
		System.out.println("Ahorro hijo: "+hijo1.getTotalAhorrado());
	}

}
