package com.krakedev.herencia.test;

import java.util.ArrayList;

import com.krakedev.herencia.Hija;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Hija>listadeHijas =  new ArrayList<Hija>();
		
		Hija hija1 = new Hija(2,4,"Maria");
		hija1.setDefectos(2);
		hija1.setVirtudes(4);
		
		listadeHijas.add(hija1);
		
		Hija hija2 = new Hija(2,4,"Susana");
		hija2.setDefectos(5);
		hija2.setVirtudes(4);
		
		listadeHijas.add(hija2);
		
		Hija hija3 = new Hija(3,2,"Marta");
		hija3.setDefectos(4);
		hija3.setVirtudes(8);
		listadeHijas.add(hija3);
		
		System.out.println(listadeHijas);
		

	}

}
