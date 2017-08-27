/**
 * 
 */
package options;

import java.io.Serializable;

/**
 * @author flkol
 *
 */
public class GPS implements Option, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6679690409756286986L;
	private Double prix;

	public GPS(Double prix) {
		this.prix = prix;
	}

	public String toString() {
		return "GPS (" + prix + "€)";
	}

	public double getPrix() {
		return this.prix;
	}

}
