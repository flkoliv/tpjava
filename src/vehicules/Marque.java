/**
 * 
 */
package vehicules;

import java.io.Serializable;

/**
 * @author flkol
 *
 */
public enum Marque implements Serializable {
	RENO("RENO"), PIGEOT("PIGEOT"), TROEN("TROEN");

	private String marque;

	private Marque(String marque) {
		this.marque = marque;
	}

	public Marque getMarque() {
		return this;
	}

	public String toString() {
		return marque;
	}

}