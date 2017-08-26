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
public class BarreDeToit implements Option,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2356087208171846814L;
	private Double prix;

	public BarreDeToit(Double prix) {
		this.prix = prix;
	}

	public String toString() {
		return "Barre de toit ("+prix+"€)";	
	}
	
	public double getPrix() {	
		return this.prix;
	}

}
