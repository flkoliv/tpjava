package tpjava;

import java.io.Serializable;

public class Lagouna extends Vehicule implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8056403614886632393L;

	public Lagouna() {
		super.nomMarque = Marque.RENO;
		super.nom = "Lagouna";
	}
	
	
}
