/**
 * 
 */
package tpjava;

import java.io.Serializable;
import java.util.Scanner;

/**
 * @author flkol
 *
 */
public class Climatisation implements Option,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7648994829704488831L;
	private Double prix;

	public Climatisation(Double prix) {
		this.prix = prix;
	}

	public Climatisation() {
		Scanner sc = new Scanner(System.in);
		boolean b = false;
		do {
			try {
				System.out.print("Entrez le prix de la climatisation: ");
				this.prix = sc.nextDouble();
				b = false;
			} catch (Exception e) {
				System.out.println("invalide !!!");
				sc.next();
				b = true;
			}
		} while (b);

	}

	public String toString() {
		return "Climatisation (" + prix + "€)";

	}

	public double getPrix() {

		return this.prix;
	}

}
