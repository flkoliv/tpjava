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

	public MoteurElectrique(String cylindre, Double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.ELECTRIQUE;
	}

	

}
