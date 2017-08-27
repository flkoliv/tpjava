/**
 * 
 */
package vehicules;

/**
 * @author flkol
 *
 */
public enum Marque {
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