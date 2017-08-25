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
public class VitreElectrique implements Option,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1302810837687063845L;
	private Double prix;

	public VitreElectrique(Double prix) {
		this.prix = prix;
	}

	public VitreElectrique() {
		Scanner sc = new Scanner(System.in);
		boolean b = false;
		do {
			try {
				System.out.print("Entrez le prix des vitres electriques : ");
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
		return "Vitres électriques (" + prix + "€)";

	}

	public double getPrix() {
		return this.prix;
	}

}
