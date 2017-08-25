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
public class SiegeChauffant implements Option,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 810086395993906933L;
	private Double prix;

	public SiegeChauffant(Double prix) {
		this.prix = prix;
	}

	public SiegeChauffant() {
		final Scanner sc = new Scanner(System.in);
		boolean b = false;
		do {
			try {
				System.out.print("Entrez le prix des sièges chauffants : ");
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
		return "Sièges chauffants (" + prix + "€)";

	}

	public double getPrix() {
		// TODO Auto-generated method stub
		return this.prix;
	}

}
