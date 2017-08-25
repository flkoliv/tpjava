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

	public GPS() {
		final Scanner sc = new Scanner(System.in);
		boolean b = false;
		do {
			try {
				System.out.print("Entrez le prix du GPS : ");
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
		return "GPS (" + prix + "€)";

	}

	public double getPrix() {

		return this.prix;
	}

}
