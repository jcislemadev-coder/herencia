package com.krakedev.herencia;

public class Hijo extends Padre {

	private int juguetes;

	public Hijo(int virtudes, int defectos, String nombre, int juguetes) {
		super(virtudes, defectos, nombre );
		this.juguetes = juguetes;
	}

	@Override
	public String toString() {
		return "Hijo [juguetes=" + juguetes + ", getDefectos()=" + getDefectos() + ", getVirtudes()=" + getVirtudes()
				+ "]";
	}

	@Override
	public void ahorrar(double monto) {
		setTotalAhorrado(getTotalAhorrado() + (monto/2));
	}

}
