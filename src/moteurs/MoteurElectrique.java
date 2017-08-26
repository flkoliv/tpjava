/**
 * 
 */
package moteurs;


/**
 * @author flkol
 *
 */
public class MoteurElectrique extends Moteur {

	/**
	 * 
	 */
	private static final long serialVersionUID = -980652086853643360L;

	/**
	 * 
	 */

	public MoteurElectrique(String cylindre, Double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.ELECTRIQUE;
	}

	

}
