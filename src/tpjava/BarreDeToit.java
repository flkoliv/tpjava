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
public class BarreDeToit implements Option,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2356087208171846814L;
	private Double prix;

	public BarreDeToit(Double prix) {
		this.prix = prix;
	}

	public BarreDeToit() {
		Scanner sc = new Scanner(System.in);
		boolean b = false;
		do {
			try {
				System.out.print("Entrez le prix des barres de toit: ");
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
		return "Barre de toit ("+prix+"€)";
		
	}
	
	public double getPrix() {
		
		return this.prix;
	}

}
