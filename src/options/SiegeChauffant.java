/**
 * 
 */
package options;

import java.io.Serializable;

/**
 * @author flkol
 *
 */
public class SiegeChauffant implements Option,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 810086395993906933L;
	private Double prix;

	public SiegeChauffant(Double prix) {
		this.prix = prix;
	}


	public String toString() {
		return "Sièges chauffants (" + prix + "€)";
	}

	public double getPrix() {
		return this.prix;
	}

}
