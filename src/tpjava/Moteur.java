/**
 * 
 */
package tpjava;

import java.io.Serializable;

/**
 * @author flkol
 *
 */
public abstract class Moteur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6026628512874764099L;
	protected TypeMoteur type;
	protected String cylindre;
	protected Double prix;

	public Moteur(String cylindre, Double prix) {
		this.cylindre = cylindre;
		this.prix = prix;
		
	}

	public String toString() {
		return "Moteur " + this.type + " " + this.cylindre + " (" + this.prix + "€)";
	}

	public Double getPrix() {
		return this.prix;
	}

}
