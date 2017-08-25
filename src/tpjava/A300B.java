package tpjava;

import java.io.Serializable;

public class A300B extends Vehicule implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5082272378430286007L;

	public A300B() {
		super.nomMarque = Marque.PIGEOT;
		super.nom = "A300B";
	}
	
	
}
