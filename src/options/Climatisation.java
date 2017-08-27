/**
 * 
 */
package options;

import java.io.Serializable;

/**
 * @author flkol
 *
 */
public class Climatisation implements Option, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7648994829704488831L;
	private Double prix;

	public Climatisation(Double prix) {
		this.prix = prix;
	}

	public String toString() {
		return "Climatisation (" + prix + "€)";
	}

	public double getPrix() {
		return this.prix;
	}

}
