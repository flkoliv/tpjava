/**
 * 
 */
package options;

import java.io.Serializable;

/**
 * @author flkol
 *
 */
public class VitreElectrique implements Option,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1302810837687063845L;
	private Double prix;

	public VitreElectrique(Double prix) {
		this.prix = prix;
	}


	public String toString() {
		return "Vitres électriques (" + prix + "€)";
	}

	public double getPrix() {
		return this.prix;
	}

}
