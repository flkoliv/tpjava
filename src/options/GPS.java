/**
 * 
 */
package options;

import java.io.Serializable;
import java.util.Scanner;

/**
 * @author flkol
 *
 */
public class GPS implements Option,Serializable{

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
